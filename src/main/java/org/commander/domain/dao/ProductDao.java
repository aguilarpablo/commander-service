package org.commander.domain.dao;

import org.commander.domain.model.Product;

import java.util.List;

public interface ProductDao {

    Product save(Product product);

    List<Product> findAll();

    Product update(Product product);

    Boolean delete(Integer productId);

}
