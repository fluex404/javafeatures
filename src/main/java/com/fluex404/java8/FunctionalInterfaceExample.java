package com.fluex404.java8;

/**
 * And interface that contains exatcly one abstract method is known as functional interface.
 * It can have any number of default, static methods but can contains only one abstract method.
 * It can also declare methods of object class.
 *
 * Functoinal Interface is also known as Single Abstract Method Interaces or SAM interface.
 * It is a new feature in java, which helps to achieve functional programming approach.
 */

public class FunctionalInterfaceExample implements sayable{
    public static void main(String[] args) {
        FunctionalInterfaceExample f = new FunctionalInterfaceExample();
        f.say("Hallo there");
    }

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
}
interface sayable{
    void say(String msg);
}
