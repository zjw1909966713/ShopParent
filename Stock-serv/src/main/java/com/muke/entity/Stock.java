package com.muke.entity;

import javax.persistence.*;

/**
 * @ClassName: Stock
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/08/03 12:12
 * @Version: 1.0
 */
@Entity
@Table(name ="stocktb")
public class Stock {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="product_id")
    private Integer productId;

    @Column(name = "count")
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
