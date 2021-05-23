package com.letshop.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "review")
@Data
public class Review {

    @Id
    @Column(name = "item_id", updatable = false)
    private Long item_id;

    @Column(name = "cust_id", nullable = false)
    private Long cust_id;

    @Column(name = "timestamp", nullable = false)
    private String timestamp;

    @Column(name = "description", nullable = false)
    private int description;

    @Column(name = "rating", nullable = false)
    private int rating;

}
