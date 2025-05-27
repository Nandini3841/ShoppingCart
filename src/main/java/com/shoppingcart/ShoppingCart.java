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
            productDAO.save(new Product("Headphones", "Over-ear wireless", 150.0, 0.18, 40));
            productDAO.save(new Product("Mouse", "Wireless ergonomic", 35.0, 0.12, 75));
            productDAO.save(new Product("Keyboard", "Mechanical RGB", 70.0, 0.15, 60));
            productDAO.save(new Product("Backpack", "Waterproof laptop bag", 80.0, 0.10, 50));
            productDAO.save(new Product("Monitor", "24-inch LED", 200.0, 0.20, 30));
            productDAO.save(new Product("Sneakers", "Running shoes", 120.0, 0.13, 90));
            productDAO.save(new Product("Water Bottle", "Insulated stainless steel", 25.0, 0.07, 150));
            productDAO.save(new Product("Phone Case", "Silicone iPhone cover", 15.0, 0.05, 180));
            productDAO.save(new Product("Charger", "Fast USB-C charger", 20.0, 0.08, 100));
            productDAO.save(new Product("Pen", "Ballpoint pen pack", 5.0, 0.03, 300));
            productDAO.save(new Product("Lamp", "LED desk lamp", 40.0, 0.10, 45));
            productDAO.save(new Product("Gaming Chair", "Adjustable ergonomic", 250.0, 0.18, 20));
            productDAO.save(new Product("Notebook Stand", "Aluminum adjustable", 35.0, 0.10, 70));
            productDAO.save(new Product("USB Drive", "64GB 3.0", 18.0, 0.07, 130));
            productDAO.save(new Product("Tablet", "8-inch Android", 180.0, 0.15, 25));
            productDAO.save(new Product("Power Bank", "10,000 mAh fast charge", 45.0, 0.12, 80));
            productDAO.save(new Product("Smartwatch", "Fitness tracker", 160.0, 0.17, 35));
        };
    }
}
