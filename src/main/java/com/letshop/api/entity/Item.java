package com.letshop.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "Item")
@Table(
        name = "Item"
)
public class Item {

    @Id
    @SequenceGenerator(
            name="item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1 // How much the sequence increases
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence"
    )

    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "unit_remaining", nullable = false)
    private int unitRemaining;

    @Column(name = "unit_sold", nullable = false)
    private int unitSold;

    public Item() {
    }

    public Item(Long id, String name, String category, double price, String description, int unitRemaining,
                int unitSold) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.unitRemaining = unitRemaining;
        this.unitSold = unitSold;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitRemaining() {
        return unitRemaining;
    }

    public void setUnitRemaining(int unitRemaining) {
        this.unitRemaining = unitRemaining;
    }

    public int getUnitSold() {
        return unitSold;
    }

    public void setUnitSold(int unitSold) {
        this.unitSold = unitSold;
    }


}
