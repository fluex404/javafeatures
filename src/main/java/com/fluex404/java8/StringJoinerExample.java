package com.fluex404.java8;

import java.sql.Connection;
import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) delimiter

        // adding values to stringjoiner
        joinNames.add("Isa");
        joinNames.add("Imas");
        joinNames.add("Ipul");
        joinNames.add("Nara");

        System.out.println(joinNames);

        // adding prefix and suffix
        StringJoiner joinNames2 = new StringJoiner(",", "[", "]");
        joinNames2.add("Isa");
        joinNames2.add("Imas");
        joinNames2.add("Ipul");
        joinNames2.add("Nara");

        
        System.out.println(joinNames2);
    }
}
