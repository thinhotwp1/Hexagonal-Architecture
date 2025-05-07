package com.example.hexagonalarchitecture.adapter.web;

import com.example.hexagonalarchitecture.domain.port.in.CreateOrderUseCase;
import com.example.hexagonalarchitecture.dto.OrderRequest;
import com.example.hexagonalarchitecture.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private CreateOrderUseCase createOrderUseCase;

    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest request) {
        return ResponseEntity.ok(createOrderUseCase.createOrder(request));
    }
}
