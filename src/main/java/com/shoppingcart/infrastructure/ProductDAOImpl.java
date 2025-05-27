package com.shoppingcart.infrastructure;

import com.shoppingcart.domain.Product;
import com.shoppingcart.domain.ProductDAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;

import java.util.List;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {

    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    public void init() {
        System.out.println("✅ ProductDAOImpl initialized (Spring is managing this bean)");
    }

    @Override
    public void save(Product product) {
        em.persist(product);
    }

    @Override
    public Product findById(Long id) {
        return em.find(Product.class, id);
    }

    @Override
    public List<Product> findAll() {
        return em.createQuery("FROM Product", Product.class).getResultList();
    }
}
