package com.hexagonal.shop.domain.services;

import com.hexagonal.shop.domain.PriceArchive;
import com.hexagonal.shop.domain.core.PriceCalculator;
import com.hexagonal.shop.domain.core.Product;

import java.util.List;

//Services that allow access to the domain
public class RealShopService implements ShopService {

    private final PriceCalculator priceCalculator;
    private final PriceArchive priceArchive;

    public RealShopService(PriceCalculator priceCalculator, PriceArchive priceArchive) {
        this.priceCalculator = priceCalculator;
        this.priceArchive = priceArchive;
    }

    public double calculatePrice(List<Product> products) {
        double price = priceCalculator.calculate(products);
        priceArchive.save(price, products, System.currentTimeMillis());
        return price;
    }
}
