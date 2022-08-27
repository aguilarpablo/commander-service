package org.commander.domain.dao;

import org.commander.domain.enums.OrderStatus;
import org.commander.domain.model.Order;

import java.util.List;

public interface OrderDao {

    Order save(Order order);

    List<Order> findByStatus(OrderStatus status);

    Boolean delete(Integer orderId);

}
