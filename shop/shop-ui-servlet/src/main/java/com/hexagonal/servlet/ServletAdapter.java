package com.hexagonal.servlet;


import com.hexagonal.shop.domain.core.Product;
import com.hexagonal.shop.domain.services.ShopService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ServletAdapter extends HttpServlet {
    private ShopService shopService;

    public ServletAdapter(ShopService shopService) {
        //To change body of created methods use File | Settings | File Templates.
        this.shopService = shopService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write("Hola Mundo");
        resp.flushBuffer();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = Arrays.asList(new Product("platano",18));
        resp.setContentType("text/html;charset=UTF-8");
        resp.setStatus(HttpServletResponse.SC_OK);
        double calculatedPrice = shopService.calculatePrice(products);
        resp.getWriter().write("Oeoeoeoeoe!!!" + calculatedPrice);
        resp.flushBuffer();
    }
}
