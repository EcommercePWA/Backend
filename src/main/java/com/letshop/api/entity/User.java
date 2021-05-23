package com.letshop.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
@Data
public class User {

    @Id
    @Column(name = "cust_id", updatable = false)
    private Long cust_id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "name", nullable = false)
    private int units_sold;

}
