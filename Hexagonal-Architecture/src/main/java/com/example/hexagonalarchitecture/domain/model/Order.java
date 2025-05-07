package com.example.hexagonalarchitecture.domain.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class Order {
    private String product;
    private int quantity;
    private BigDecimal totalPrice;

    public Order(String product, int quantity, BigDecimal price) {
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = price.multiply(BigDecimal.valueOf(quantity));
    }

}
