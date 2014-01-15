package com.hexagonal.shop.mainparition;


import com.hexagonal.servlet.ServletAdapter;
import com.hexagonal.shop.domain.services.ShopService;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import java.io.File;

public class ShopServer {

    private ShopService shopService;

    public ShopServer(ShopService shopService) {
        this.shopService = shopService;
    }

    public void start() throws ServletException, LifecycleException {
        String webappDirLocation = "shop-ui-servlet/src/main/webapp/";
        Tomcat tomcat = new Tomcat();

        //The port that we should run on can be set into an environment variable
        //Look for that variable and default to 8080 if it isn't there.
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }

//        tomcat.setHost(new StandardHost());
        tomcat.setPort(Integer.valueOf(webPort));
        //This tells tomcat where the webapp is(all resources)
        Context context = tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        //System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

        //Create the servlet and pass it to the container
        tomcat.addServlet(context,"jhcgvkdcxhkj", new ServletAdapter(shopService));
        context.addServletMapping("/hola", "jhcgvkdcxhkj");

        tomcat.start();
        tomcat.getServer().await();
    }
}
