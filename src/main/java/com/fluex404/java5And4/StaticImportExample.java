package com.fluex404.java5And4;

/**
 * The static import feature of Java 5 facilitate the java programmer to access any static member of class
 * directly. There is no need to qualify it by the class name
 *
 * Advantage of static import : less coding is required if you have access any static member of class oftenly
 * Disadvantage of static import : if you overuse the static import feature, it makes the program unreadable
 * it make the program unreadable and unmaintanable
 */
import static java.lang.System.*;

public class StaticImportExample {

    public static void main(String... args) {
        out.println("Hello"); // Now no need of System.out
        out.println("Java");

    }

}
