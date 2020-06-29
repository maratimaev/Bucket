package org.example.products;

import java.util.HashMap;

public interface Products {
    Products add(Product product, Integer count);
    double cost();
    HashMap<Product, Integer> get();
}
