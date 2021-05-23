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
    private Long item_id;

    @Column(name = "title", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "weight", nullable = false)
    private String weight;

    public Item() {
    }

    public Item(Long item_id, String title, double price, String description, String category, String image,
                String weight) {
        this.item_id = item_id;
        this.name = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.weight = weight;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
