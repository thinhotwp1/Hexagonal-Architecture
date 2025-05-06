package com.example.hexagonalarchitecture.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderResponse {
    private Long id;
    private String product;
    private BigDecimal total;

    public OrderResponse(String product, BigDecimal total) {
        this.product = product;
        this.total = total;
    }
    // Getters
}