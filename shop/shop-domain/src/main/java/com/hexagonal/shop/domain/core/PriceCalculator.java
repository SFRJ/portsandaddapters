package com.hexagonal.shop.domain.core;

import java.util.List;
/*
* THE DOMAIN IS THE STARTING POINT OF THE HEXAGONAL ARCHITECTURE*/
public class PriceCalculator {

    public double calculate(List<Product> products) {
        double finalPrice = 0.0D;
        for (Product product : products) {
            finalPrice += product.getPrice();
        }

        return finalPrice;
    }
}
