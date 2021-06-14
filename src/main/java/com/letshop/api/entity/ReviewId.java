package com.letshop.api.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@Setter(AccessLevel.NONE)
public class ReviewId implements Serializable {

    @Column(name = "item_id", updatable = false)
    private Long itemId;

    @Column(name = "cust_id", nullable = false)
    private Long custId;

    @Column(name = "timestamp", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime timestamp;

}
