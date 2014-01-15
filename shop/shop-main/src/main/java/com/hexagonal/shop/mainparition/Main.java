package com.hexagonal.shop.mainparition;


import java.net.URISyntaxException;

public class Main {
//MAIN PARTITION: Assembles your application
    public static void main(String[] args) throws URISyntaxException {

/*
* This project assemblies the application, this means that each of the adapters will have what they
* require, to work.
* It allows you to customize the application based on a wide variety of properties(e.g System specific):
* -pick the adapters you want to use
* -use multiple adapters
* -dissable some addapters
*
* A recommended way of doing this easily could be to just create parametrized assembler classes that will be
* called from there(Main), to customize the application as per our will.
*
* Some examples:
* URI logUri = new URI(args[0]);
* String databaseProfile = "production" //// "test"
* if (databaseProfile) == "production" ==> new HibernatePriceArchive(new entityManager());
* if (databaseProfile) == "test" ==> new SystemOutPriceArchive();
* */
try {
        ShopAssembler shopAssembler = new ShopAssembler();
        ShopServer shopServer = shopAssembler.assemblyApplication();
        shopServer.start();

}
catch (Exception e) {
e.printStackTrace();
}
         //This is the same than the lines above
        //new ShopAssembler().assemblyApplication().startApplication();
    }

}
