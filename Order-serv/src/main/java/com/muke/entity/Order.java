package com.muke.entity;

import javax.persistence.*;

/**
 * @ClassName: Order
 * @Author: zjw
 * @Description: TODO
 * @Date: 2021/08/03 12:01
 * @Version: 1.0
 */
@Entity
@Table(name = "ordertb")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="product_id")
    private Integer productId;

    @Column(name = "user_id")
    private Integer userId;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
