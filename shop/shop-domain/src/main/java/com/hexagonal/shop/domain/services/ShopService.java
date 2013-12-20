package com.hexagonal.shop.domain.services;

import com.hexagonal.shop.domain.core.Product;

import java.util.List;

/**
 THIS IS A PORT
 */
public interface ShopService {
    double calculatePrice(List<Product> products);
}
