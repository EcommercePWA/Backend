package com.letshop.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Think of proper design for customer cart, item review
@Entity(name = "CustomerCart")
@Table(name = "customer_cart")
@Data
public class CustomerCart {

    @Id
    @Column(name = "cust_id", updatable = false)
    private Long custId;

    @Column(name = "item_id", nullable = false)
    private String itemId;

    @Column(name = "amount", nullable = false, precision = 2)
    private int amount;
}
