package com.example.hexagonalarchitecture.application.service;

import com.example.hexagonalarchitecture.domain.model.Order;
import com.example.hexagonalarchitecture.domain.port.in.CreateOrderUseCase;
import com.example.hexagonalarchitecture.domain.port.out.SaveOrderPort;
import com.example.hexagonalarchitecture.dto.OrderRequest;
import com.example.hexagonalarchitecture.dto.OrderResponse;
import org.springframework.stereotype.Service;

@Service
public class CreateOrderService implements CreateOrderUseCase {

    private final SaveOrderPort saveOrderPort;

    public CreateOrderService(SaveOrderPort saveOrderPort) {
        this.saveOrderPort = saveOrderPort;
    }

    @Override
    public OrderResponse createOrder(OrderRequest request) {
        Order order = new Order(request.getProduct(), request.getQuantity(), request.getPrice());
        saveOrderPort.save(order);
        return new OrderResponse(order.getProduct(), order.getTotalPrice());
    }
}
