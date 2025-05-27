package com.shoppingcart;

import com.shoppingcart.domain.Product;
import com.shoppingcart.domain.ProductDAO;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShoppingCart {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCart.class, args);
        System.out.println("✅ App started with product loading...");
    }

    @Bean
    CommandLineRunner insertSampleProducts(ProductDAO productDAO) {
        return args -> {
            productDAO.save(new Product("T-shirt", "Cotton round-neck", 50.0, 0.15, 100));
            productDAO.save(new Product("Pizza", "Margherita 12in", 30.0, 0.10, 50));
            productDAO.save(new Product("Notebook", "A4 ruled 100 pages", 10.0, 0.05, 200));
        };
    }
}
