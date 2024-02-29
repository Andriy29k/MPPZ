package org.example.creationalPattern.builder;

public interface ProductBuilder {
    ProductBuilder setName(String name);

    ProductBuilder setType(String type);

    ProductBuilder setPrice(double price);

    ProductBuilder setWeight(double weight);

    Product build();
}
