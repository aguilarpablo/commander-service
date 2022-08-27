package org.commander.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.commander.domain.enums.OrderStatus;

@Getter
@Setter
public class Order {

    private Integer id;
    private Product product;
    private Integer tableNumber;
    private OrderStatus status;
    private Integer productQuantity;

}
