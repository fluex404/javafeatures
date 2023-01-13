package com.fluex404.java8;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        var str = Optional.ofNullable(null);
        System.out.println(str.orElse("kosong pak :'("));


        var str2 = Optional.ofNullable("kuda");
        System.out.println(str2.orElse("kosong pak :'("));
    }
}
