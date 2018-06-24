package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    int id;
    int idCount = 1;
    String name;
    String description;

    Supplier(){
        id = idCount;
        idCount++;
    }
    Supplier(String name, String description){
        id = idCount;
        idCount++;
        setName(name);
        setDescription(description);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        return products;
    }
    public String toString() {
        String returnString;
        returnString = "id:" + String.valueOf(id)+",name:"+name;
        return returnString;
    }
}
