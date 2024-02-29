package org.example.creationalPattern.builder;

import org.example.creationalPattern.builder.Product;
import org.example.creationalPattern.builder.ProductBuilderImpl;

public class main {
    public static void main(String[] args) {
        //Builder pattern

        Product product = new ProductBuilderImpl()
                .setName("Pc Mouse")
                .setType("Electronics")
                .setPrice(503)
                .build();
        product.print();
    }
}

