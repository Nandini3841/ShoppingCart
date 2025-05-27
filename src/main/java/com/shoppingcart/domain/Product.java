package com.shoppingcart.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "nandini_bogineni_product") // 🔁 Replace 'yourname' with your actual name
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
    private Double taxRate;
    private int quantity;

    public Product() {
    }

    public Product(String name, String description, Double price, Double taxRate, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.taxRate = taxRate;
        this.quantity = quantity;
    }

    // Getters and setters (generate in VS Code or write manually)
}
