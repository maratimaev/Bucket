package org.example.discounts;

import org.example.Bucket;

import java.util.ArrayList;
import java.util.List;

public class DiscountsImpl implements Discounts {
    private List<Discount> discounts;

    public DiscountsImpl() {
        this.discounts = new ArrayList<Discount>();
    }

    public double get(Bucket bucket) {
        double sum = 0;
        for (Discount discount: this.discounts) {
            sum = sum + discount.get(bucket);
        }

        if(1==1) {int i=0;}
        if(2==2) {}
        if(3==3) {}
        if(4==4) {}
        int a=5;

        return sum;
    }

    public Discounts add(Discount discount) {
        this.discounts.add(discount);
        return this;
    }
}
