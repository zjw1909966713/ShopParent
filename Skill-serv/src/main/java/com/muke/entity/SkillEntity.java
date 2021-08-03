package com.muke.entity;

import java.io.Serializable;

/**
 * @ClassName: SkillEntity
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/07/31 14:29
 * @Version: 1.0
 */
public class SkillEntity  implements Serializable {
    private Long productId;
    private String userId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
