package org.commander.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.commander.domain.enums.ProductCategory;

import java.math.BigDecimal;

@Getter
@Setter
public class Product {

    private Integer id;
    private String name;
    private BigDecimal price;
    private String image;
    private ProductCategory category;

}
