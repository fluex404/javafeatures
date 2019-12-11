package com.fluex404.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        productsList.stream()
                .map(x -> x.price) // fetching price
                .collect(Collectors.toList()) // collecting as list
                .forEach(System.out::println); // displaying

        productsList.stream()
                .map(x -> x.price) // fetching price
                .collect(Collectors.toSet()) // collecting as set
                .forEach(System.out::println); // diplaying

        // sum
        System.out.println(productsList.stream()
                .collect(Collectors.summingDouble(x -> x.price))
        );

        // getting product average price
        System.out.println(
                productsList.stream()
                .collect(Collectors.averagingDouble(p -> p.price))
        );

        // counting elements
        System.out.println(
                productsList.stream().collect(Collectors.counting())
        );

    }
}
