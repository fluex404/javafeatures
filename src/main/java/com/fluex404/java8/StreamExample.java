package com.fluex404.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
            new Product(1,"HP Laptop",25000f),
            new Product(2,"Dell Laptop",30000f),
            new Product(3,"Lenevo Laptop",28000f),
            new Product(4,"Sony Laptop",28000f),
            new Product(5,"Apple Laptop",90000f)
        );
        List<Float> productPriceList = new ArrayList<>();
        for(Product p : productList) {
            // filtering data of list
            if(p.price < 30000) {
                productPriceList.add(p.price);
            }
        }
        System.out.println(productPriceList);

        // using stream
        List<Float> productPriceList2 = productList.stream()
                .filter(p -> p.price < 30000) // filter data
                .map(p -> p.price) //fetch price
                .collect(Collectors.toList());
        System.out.println(productPriceList2);

        // iterating
        Stream.iterate(1, element-> element+1)
                .filter(element -> element%5 == 0)
                .limit(5)
                .forEach(System.out::println);

        // this is more compact approach for filtering data
        productList.stream()
                .filter(p -> p.price == 30000)
                .forEach(p -> System.out.println(p.name));

        // this is more compact approach for filter data
        Float totalPrice = productList.stream()
                .map(p -> p.price)
                .reduce(0.0f, (sum, price)-> sum+price); // accumulating price
        System.out.println(totalPrice);
        //More precise code
        float totalPrice2 = productList.stream()
                .map(p -> p.price)
                .reduce(0.0f, Float::sum); // accumulating price
        System.out.println(totalPrice2);

        // using collectors's method to sum the prices.
        double totalPrice3 = productList.stream()
                .collect(Collectors.summingDouble(p -> p.price));
        System.out.println(totalPrice3);

        // max() method to get max Product price
        Product productA = productList.stream()
                .max((p1, p2) -> p1.price > p2.price? 1:-1)
                .get();
        System.out.println(productA.price);

        //min() method to get min Product price
        Product productB = productList.stream()
                .max((p1,p2) -> p1.price<p2.price? 1:-1).get();
        System.out.println(productB.price);

        //count number of products base on the filter
        long count = productList.stream()
                .filter(p -> p.price<30000)
                .count();
        System.out.println(count);

        // converting product List into Set
        Set<Float> productPriceList3 = productList.stream()
                .filter(p -> p.price < 30000)
                .map(p -> p.price)
                .collect(Collectors.toSet());
        System.out.println(productPriceList3);

        //converting Product List into a Map
        Map<Integer, String> productPriceMap = productList.stream()
                .collect(Collectors.toMap(p -> p.id, p-> p.name));
        System.out.println(productPriceMap);

        // method reference
        List<Float> productPriceList4 = productList.stream()
                .filter(p -> p.price > 30000) // filter data
                .map(Product::getPrice) // fetching price by referring getPrice method
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList4);
    }
}

