package com.hexagonal.shop.mainparition;

import com.hexagonal.shop.domain.core.PriceCalculator;
import com.hexagonal.shop.domain.services.RealShopService;
import com.hexagonal.shop.persistence.Client;
import com.hexagonal.shop.persistence.SystemOutPriceArchive;

import java.net.URI;


class ShopAssembler {

    public Client assemblyApplication() {
    return new Client(
            new RealShopService(
                    new PriceCalculator(),
                    new SystemOutPriceArchive()
            )
    );
}
}
