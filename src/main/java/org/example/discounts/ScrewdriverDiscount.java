package org.example.discounts;

import org.example.Bucket;

public class ScrewdriverDiscount extends Discount{

    public double get(Bucket bucket) {
        if (!checkForDiscount(bucket.getProducts())) return 0;
        return bucket.getBucketCost() * 0.1;
    }
}
