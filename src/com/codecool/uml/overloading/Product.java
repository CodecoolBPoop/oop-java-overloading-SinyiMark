package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {
    static int idCount = 1;
    int id;
    String name;
    float defaultPriice;
    Currency defaultCurrency;
    ProductCategory productCategory;
    Supplier supplier;
    List<Product> productList;

    Product(){
        id = idCount;
        idCount++;
    }

    Product(String name,float defaultPriice, Currency defaultCurrency){
        id = idCount;
        idCount++;
        setName(name);
        setDefaultPriice(defaultPriice);
        setDefaultCurrency(defaultCurrency);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPriice() {
        return defaultPriice;
    }

    public void setDefaultPriice(float defaultPriice) {
        this.defaultPriice = defaultPriice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory){
        List<Product> matchedProducts = new ArrayList<>();
        for (Product product:productList){
            if (product.getProductCategory()==productCategory){
                matchedProducts.add(product);
            }
        }
        return matchedProducts;
    }

    public List<Product> getAllProductsBy(Supplier supplier){
        List<Product> matchedProducts = new ArrayList<>();
        for (Product product:productList){
            if (product.getSupplier()==supplier){
                matchedProducts.add(product);
            }
        }
        return matchedProducts;
    }
    public String toString(){
        String returnString;
        returnString = "id:" + String.valueOf(id)+",name:"+name+",defaultprice:"+String.valueOf(defaultPriice);
        return returnString;
    }
}
