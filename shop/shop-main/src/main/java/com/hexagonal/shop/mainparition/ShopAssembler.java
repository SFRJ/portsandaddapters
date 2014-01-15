package com.hexagonal.shop.mainparition;

import com.hexagonal.shop.domain.core.PriceCalculator;
import com.hexagonal.shop.domain.services.RealShopService;
import com.hexagonal.shop.persistence.SystemOutPriceArchive;

import java.net.URI;


class ShopAssembler {

    public ShopServer assemblyApplication() {
    return new ShopServer(
            new RealShopService(
                    new PriceCalculator(),
                    new SystemOutPriceArchive()
            )
    );
    }
}

