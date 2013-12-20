package com.hexagonal.shop.persistence;

import com.hexagonal.shop.domain.PriceArchive;
import com.hexagonal.shop.domain.core.Product;
import java.util.List;

//This is one of the classes of the persistence adapter. This is just a simulation
//of a CRUD service.
//The important thing is that the parameters specified are of the type of the domain,
//but when persistence has to be done, they have to be transformed to the persistence specific
//representation, this way we protect the domain from leakeage of persistence classes(non domain
// specific stuff).
//In the same way as other adapters works, it will be the responsibility of shop-main to make
//sure that the desired specific implementation is provided to the classes from the domain module
// (e.g EntitManager).
//Note: In the pom.xml of shop-persistence, notice that there will be the persistence API(If one)
//specific dependencies and since shop-main depends on shop-persistence then the shop-main project is
//capable of passing the required EntityManager and accoplish a leakless assempbly of the persistance layer.

public class SystemOutPriceArchive implements PriceArchive {

//    private EntityManager entityManager;
//
//    public HibernatePriceArchive(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }

    @Override
    public void save(double price, List<Product> products, long timestamp) {
        System.out.println(
                "Persisting price " + price +
                        " of products " + products +
                        " at the timestamp " + timestamp);
    }
//
//    public List<Product> retrieve() {
//       List<ProductEntity> entities = entityManager.findAll(ProductEntity.class)
//       //Transform List<ProductEntity> to List<Product>
//
//        return null;//return List<Product>
//    }
}
