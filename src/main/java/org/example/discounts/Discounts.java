package org.example.discounts;

import org.example.Bucket;

public interface Discounts {
    double get(Bucket bucket);
    Discounts add(Discount discount);
}
