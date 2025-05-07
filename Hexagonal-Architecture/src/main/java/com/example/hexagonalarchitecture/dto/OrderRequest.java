package com.example.hexagonalarchitecture.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderRequest {
    private String product;
    private int quantity;
    private BigDecimal price;
}