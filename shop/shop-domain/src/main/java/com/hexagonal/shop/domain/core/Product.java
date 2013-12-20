package com.hexagonal.shop.domain.core;

/**
* Created with IntelliJ IDEA.
* User: pro
* Date: 06/12/13
* Time: 19:09
* To change this template use File | Settings | File Templates.
*/
public class Product {

    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
