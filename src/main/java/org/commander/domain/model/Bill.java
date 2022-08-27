package org.commander.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Bill {

    private Integer id;
    private BigDecimal finalPrice;
    private Boolean isPaid;
    private String comments;
    private Integer tableNumber;
    private List<Product> products;

}
