package com.example.hexagonalarchitecture.adapter.persistence;

import com.example.hexagonalarchitecture.domain.model.Order;
import com.example.hexagonalarchitecture.domain.port.out.SaveOrderPort;
import org.springframework.stereotype.Component;

@Component
public class OrderPersistenceAdapter implements SaveOrderPort {

    private final SpringDataOrderRepository repository;

    public OrderPersistenceAdapter(SpringDataOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Order order) {
        OrderJpaEntity entity = new OrderJpaEntity();
        entity.setProduct(order.getProduct());
        entity.setQuantity(order.getQuantity());
        entity.setTotalPrice(order.getTotalPrice());
        repository.save(entity);
    }
}
