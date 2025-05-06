package com.example.hexagonalarchitecture.domain.port.in;

import com.example.hexagonalarchitecture.dto.OrderRequest;
import com.example.hexagonalarchitecture.dto.OrderResponse;

public interface CreateOrderUseCase {
    OrderResponse createOrder(OrderRequest request);
}

