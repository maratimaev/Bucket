package org.example;

import org.example.discounts.Discount;
import org.example.discounts.Discounts;
import org.example.products.Product;
import org.example.products.Products;

public class Bucket {
    private Products products;
    private Discounts discounts;

    public Bucket(Products products, Discounts discounts) {
        this.products = products;
        this.discounts = discounts;
    }

    public Bucket addProduct(Product product, Integer count) {
        products.add(product, count);
        return this;
    }

    public double getBucketCost() {
        return products.cost();
    }

    public double getCost() {
        double cost = getBucketCost();
        double discount = discounts.get(this);
        return cost - discount;
    }

    public Bucket addDiscount(Discount discount) {
        this.discounts.add(discount);
        return this;
    }

    public Products getProducts() {
        return products;
    }
}
