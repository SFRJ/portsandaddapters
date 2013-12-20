package com.hexagonal.shop.domain;

import com.hexagonal.shop.domain.core.Product;

import java.util.List;

public interface PriceArchive {
    void save(double price, List<Product> products, long timestamp);
}
