package com.fluex404.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");

        System.out.println("-----------Iterating byte pssing lamda expression--------");
        gamesList.forEach(game -> System.out.println(game));

        System.out.println("-----------Iterating byte pssing lamda expression--------");
        gamesList.forEach(System.out::println);
    }
}
