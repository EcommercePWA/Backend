package com.letshop.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
        name = "User",
        uniqueConstraints = @UniqueConstraint(name = "unique_email", columnNames = "email")
)
@Data
public class Customer {

    @Id
    @Column(name = "cust_id", updatable = false)
    private Long custId;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "units_sold", nullable = false)
    private int unitsSold;

}
