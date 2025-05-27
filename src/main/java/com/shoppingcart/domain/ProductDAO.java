package com.shoppingcart.domain;

import java.util.List;

public interface ProductDAO {
    void save(Product product);

    Product findById(Long id);

    List<Product> findAll();
}
