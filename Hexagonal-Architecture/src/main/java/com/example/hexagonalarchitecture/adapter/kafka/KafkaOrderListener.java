package com.example.hexagonalarchitecture.adapter.kafka;

import com.example.hexagonalarchitecture.domain.port.in.CreateOrderUseCase;
import com.example.hexagonalarchitecture.dto.OrderRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaOrderListener {

    private final CreateOrderUseCase createOrderUseCase;

    public KafkaOrderListener(CreateOrderUseCase createOrderUseCase) {
        this.createOrderUseCase = createOrderUseCase;
    }

    @KafkaListener(topics = "order-topic", groupId = "order-group", containerFactory = "orderKafkaListenerContainerFactory")
    public void handleOrder(OrderRequest request) {
        // Directly call the UseCase
        createOrderUseCase.createOrder(request);
        System.out.println("Handled order from Kafka: " + request);
    }
}
