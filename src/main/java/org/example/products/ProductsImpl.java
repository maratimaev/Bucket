package org.example.products;

import java.util.HashMap;

public class ProductsImpl implements Products {

    private HashMap<Product, Integer> products;

    public ProductsImpl() {
        this.products = new HashMap<Product, Integer>();
    }

    public Products add(Product product, Integer count) {
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + count);
        } else {
            this.products.put(product, count);
        }
        return this;
    }

    public double cost() {
        double cost = 0;
        for(Product product : products.keySet()) {
            cost = cost + product.getPrice() * products.get(product);
        }
        return cost;
    }

    public HashMap<Product, Integer> get() {
        return products;
    }
}
