package com.muke.service;

import com.muke.dao.SkillOrderRepository;
import com.muke.entity.SkillEntity;
import com.muke.entity.SkillGood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class SkillGoodService {
    public static final String SKILL_GOODS_PHONE = "SKILL_GOODS_PHONE";
    public static final String SKILL_GOODS_LIST = "SKILL_GOODS_LIST";
    public static final String SKILL_GOODS_ONLY = "SKILL_GOODS_ONLY";
    public static final String SKILL_GOODS_QUEUE = "SKILL_GOODS_QUEUE";


    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private SkillOrderRepository skillOrderRepository;
    @Autowired
    private ProductService productService;

    @Autowired
    private MutilThreadOrder mutilThreadOrder;

//    @Transactional(rollbackFor = Exception.class)
    public void add(Long productId, String userId) throws Exception {
        //判断用户这个用户是否参加过抢单

        userId= UUID.randomUUID().toString();
        Long time=redisTemplate.boundHashOps(SKILL_GOODS_ONLY).increment(userId,1L);
        if(time>1){
            throw new Exception("重复抢单,不要太贪心");
        }



        //先封装对象,并且放入redis队列
        SkillEntity skillEntity=new SkillEntity();
        skillEntity.setProductId(productId);
        skillEntity.setUserId(userId);
        redisTemplate.boundListOps(SKILL_GOODS_LIST).leftPush(skillEntity);
        mutilThreadOrder.createOrder();
    }
}
