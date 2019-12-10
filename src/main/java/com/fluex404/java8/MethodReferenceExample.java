package com.fluex404.java8;

import java.util.function.BiFunction;

public class MethodReferenceExample {
    public static void saySomething(){
        System.out.println("Hello, this is static method");
    }
    public static void ThreadStatus(){
        System.out.println("Thread is running");
    }
    public void saySomething2(){
        System.out.println("Hello, this is non-static method");
    }
    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = MethodReferenceExample::saySomething;
        sayable.say();

        Thread t = new Thread(MethodReferenceExample::ThreadStatus);
        t.start();

        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
        BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
        System.out.println(adder3.apply(new Float(1.14), new Float(7.12)));

        // Referring non-static method using reference
        MethodReferenceExample m = new MethodReferenceExample();
        Sayable sayable2 = m::saySomething2;
        sayable2.say();

        // Constructor reference
        Messageable messageable = Message::new;
        messageable.getMessage("Hello");

    }


    @FunctionalInterface
    interface Sayable{
        void say();
    }
}

class Arithmetic {
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, float b){
        return (int) (a+b);
    }
    public static float add(float a, float b){
        return a+b;
    }
}
interface Messageable{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.println(msg);
    }
}