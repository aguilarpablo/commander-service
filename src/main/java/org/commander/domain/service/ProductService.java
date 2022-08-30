package org.commander.domain.service;

import org.commander.domain.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> findAll();

    Product updateProduct(Product product);

    Boolean deleteProduct(Integer productId);

}
