package com.letshop.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Warehouse")
@Data
public class Warehouse {

    @Id
    @Column(name = "item_id", updatable = false)
    private Long item_id;

    @Column(name = "stock", nullable = false)
    private int stock;

    @Column(name = "units_sold", nullable = false)
    private int units_sold;

    @Column(name = "num_ratings", nullable = false)
    private int num_ratings;

}
