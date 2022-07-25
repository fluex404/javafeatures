package com.fluex404.java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVariableForLamdaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("tech", "is", "beautiful");
        String output = list.stream()
                .map((String l) -> l.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(output);
    }
}
