package org.example.discounts;

import org.example.Bucket;
import org.example.products.Product;
import org.example.products.Products;

import java.util.HashMap;

abstract public class Discount {
    private HashMap<Product, Integer> productsForDiscount;

    public Discount() {
        this.productsForDiscount = new HashMap<Product, Integer>();
    }

    public Discount addProduct(Product product, Integer count) {
        if (this.productsForDiscount.containsKey(product)) {
            this.productsForDiscount.put(product, this.productsForDiscount.get(product) + count);
        } else {
            this.productsForDiscount.put(product, count);
        }
        return this;
    }

    public boolean checkForDiscount(Products productsInBucket) {
        for (Product product: this.productsForDiscount.keySet()) {
            if (!(productsInBucket.get().containsKey(product)
                    && productsInBucket.get().get(product).intValue() >= productsForDiscount.get(product).intValue()))
                return false;
        }
        return true;
    }

    public abstract double get(Bucket bucket);
}
