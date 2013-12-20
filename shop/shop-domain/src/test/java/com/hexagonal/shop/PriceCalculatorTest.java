package com.hexagonal.shop;

import com.hexagonal.shop.domain.core.PriceCalculator;
import com.hexagonal.shop.domain.core.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

public class PriceCalculatorTest {

    public static final double DELTA = 0.0001;
    private PriceCalculator priceCalculator;

    @Before
    public void setUp() throws Exception {
        priceCalculator = new PriceCalculator();
    }

    @Test
    public void priceOfNoArticlesIsZero() {
        double actualPrice = priceCalculator.calculate(new ArrayList<Product>());

        assertEquals(0.0, actualPrice, DELTA);
    }

    @Test
    public void priceOf1Product() {
        double actualPrice = priceCalculator.calculate(asList(new Product("intellij", 1000.0)));

        assertEquals(1000.0, actualPrice, DELTA);
    }

    @Test
    public void priceOfManyProduct() {
        double actualPrice = priceCalculator.calculate(asList(
                new Product("intellij", 1000.0),
                new Product("netbeans", 2000.0)));

        assertEquals(3000.0, actualPrice, DELTA);
    }

}
