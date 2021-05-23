package com.letshop.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
@Data
public class Cart {

    @Id
    @Column(name = "cust_id", updatable = false)
    private Long cust_id;

    @Column(name = "item_id", nullable = false)
    private String item_id;

    @Column(name = "amount", nullable = false)
    private int amount;
}
