package com.example.hexagonalarchitecture.domain.port.out;

import com.example.hexagonalarchitecture.domain.model.Order;

public interface SaveOrderPort {
    void save(Order order);
}

