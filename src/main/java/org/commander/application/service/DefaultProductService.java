package org.commander.application.service;

import lombok.RequiredArgsConstructor;
import org.commander.domain.dao.ProductDao;
import org.commander.domain.model.Product;
import org.commander.domain.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultProductService implements ProductService {

    private final ProductDao productDao;

    @Transactional
    @Override
    public Product createProduct(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Transactional
    @Override
    public Product updateProduct(Product product) {
        return productDao.update(product);
    }

    @Transactional
    @Override
    public Boolean deleteProduct(Integer productId) {
        return productDao.delete(productId);
    }
}
