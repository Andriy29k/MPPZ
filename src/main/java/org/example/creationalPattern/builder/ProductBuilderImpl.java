package org.example.creationalPattern.builder;

public class ProductBuilderImpl implements ProductBuilder {
    Product product = new Product();

    @Override
    public ProductBuilder setName(String name) {
        product.name = name;
        return this;
    }

    @Override
    public ProductBuilder setType(String type) {
        product.type = type;
        return this;
    }

    @Override
    public ProductBuilder setPrice(double price) {
        product.price = price;
        return this;
    }

    @Override
    public ProductBuilder setWeight(double weight) {
        product.weight = weight;
        return this;
    }

    @Override
    public Product build() {
        return product;
    }

}
