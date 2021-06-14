package com.letshop.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Item")
@Table(
        name = "Item"
)
@Data
public class Item {

    @Id
    @Column(name = "item_id", updatable = false)
    private Long itemId;

    @Column(name = "title", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "weight", nullable = false)
    private double weight;

    @Column(name = "stock", nullable = false)
    private int stock;

    @Column(name = "units_sold", nullable = false)
    private int unitsSold;

    @Column(name = "num_ratings", nullable = false)
    private int numRatings;
}
