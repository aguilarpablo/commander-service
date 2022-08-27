package org.commander.domain.service;

import org.commander.domain.enums.OrderStatus;
import org.commander.domain.model.Order;

import java.util.List;

public interface OrderService {

    Order createOrder(Order order);

    List<Order> findByStatus(OrderStatus status);

    Boolean deleteOrder(Integer orderId);
}
