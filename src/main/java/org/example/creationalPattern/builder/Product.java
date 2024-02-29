package org.example.creationalPattern.builder;

public class Product {
    String name;
    String type;
    double price;
    double weight;

    public void print() {
        System.out.println("Product: [" + name + ", " + type + ", " + price + " , " + weight + " ].");
    }

}
