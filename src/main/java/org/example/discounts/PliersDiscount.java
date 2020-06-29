package org.example.discounts;

import org.example.Bucket;

public class PliersDiscount extends Discount {

    public double get(Bucket bucket) {
        if (!checkForDiscount(bucket.getProducts())) return 0;
        return 5;
    }
}
