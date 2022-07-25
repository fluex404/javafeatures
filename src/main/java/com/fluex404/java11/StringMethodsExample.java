package com.fluex404.java11;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "";
        // isBlank()
        str = "tech is beautiful";
        System.out.println(str.isBlank()); // false
        str = "";
        System.out.println(str.isBlank()); // true
//        str = null;
//        System.out.println(str.isBlank()); // null exception

        // lines();
        str = "tech\nis\nbeautiful";
        str.lines().forEach(System.out::println); // tech\nis\nbeautiful

        // repeat(n)
        str = "kuda!";
        System.out.println(str.repeat(3));

        // stripLeading()
        str = " tech is beautiful ";
        System.out.println(str.stripLeading());

        // stripTrailing()
        str = " tech is beautiful ";
        System.out.println(str.stripTrailing());

        // strip();
        str = " tech is beautiful ";
        System.out.println(str.strip());
    }
}
