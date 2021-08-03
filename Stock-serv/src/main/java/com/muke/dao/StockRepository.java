package com.muke.dao;

import com.muke.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: StockRepository
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/08/03 12:14
 * @Version: 1.0
 */
@Repository
public interface StockRepository extends JpaRepository<Stock,Integer> {

    Stock getByProductId(Integer productId);
}
