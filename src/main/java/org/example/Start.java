package org.example;

import org.example.discounts.Discount;
import org.example.discounts.DiscountsImpl;
import org.example.discounts.PliersDiscount;
import org.example.discounts.ScrewdriverDiscount;
import org.example.products.Product;
import org.example.products.ProductsImpl;

public class Start {

    public static void main(String[] args) {
        Product screwdriver = new Product("Screwdriver", 7);
        Product pliers = new Product("Pliers", 10);
        Product screw = new Product("Screw", 0.01);

        Discount firstDiscount = new ScrewdriverDiscount()
                .addProduct(screwdriver, 1)
                .addProduct(screw, 10);

        Discount secondDiscount = new PliersDiscount()
                .addProduct(pliers, 2);

        Bucket bucket = new Bucket(new ProductsImpl(), new DiscountsImpl())
                .addProduct(screwdriver, 3)
                .addProduct(pliers, 2)
                .addProduct(screw, 100)
                .addDiscount(firstDiscount)
                .addDiscount(secondDiscount);

        double cost = bucket.getCost();
        System.out.println(cost);
    }

}
