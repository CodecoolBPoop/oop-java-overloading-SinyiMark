package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    int id;
    int idCount = 1;
    String name;
    String department;
    String description;

    ProductCategory(){
        id = idCount;
        idCount++;
    }
    ProductCategory(String name,String department, String description){
        id = idCount;
        idCount++;
        setName(name);
        setDepartment(department);
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
    @Override
    public  String toString() {
        String returnString;
        returnString = "id:" + String.valueOf(id)+",name:"+name;
        return returnString;
    }
}
