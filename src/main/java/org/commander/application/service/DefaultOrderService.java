package org.commander.application.service;

import lombok.RequiredArgsConstructor;
import org.commander.domain.dao.OrderDao;
import org.commander.domain.enums.OrderStatus;
import org.commander.domain.model.Order;
import org.commander.domain.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultOrderService implements OrderService {

    private final OrderDao orderDao;

    @Transactional
    @Override
    public Order createOrder(Order order) {
        return orderDao.save(order);
    }

    @Override
    public List<Order> findByStatus(OrderStatus status) {
        return orderDao.findByStatus(status);
    }

    @Transactional
    @Override
    public Boolean deleteOrder(Integer orderId) {
        return orderDao.delete(orderId);
    }
}
