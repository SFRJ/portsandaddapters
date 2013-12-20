package com.hexagonal.shop.persistence;

import com.hexagonal.shop.domain.core.Product;
import com.hexagonal.shop.domain.services.ShopService;

import static java.util.Arrays.asList;

//THE HOLD PROJECT shop-ui IS AN ADAPTER BECAUSE USES THE PORT TO CONNECT TO THE DOMAIN

public class Client {

    private final ShopService shopService;

    public Client(ShopService shopService) {
        this.shopService = shopService;
    }

    public void startApplication() {
        double price = shopService.calculatePrice(asList(
                new Product("eclipse", 10.0),
                new Product("vim", 5.0)));

        System.out.println("Price was " + price);


    }
}
