package com.fluex404.java8;

public class DefaultMethodExample implements Sayable3{
    public static void main(String[] args) {
        DefaultMethodExample d = new DefaultMethodExample();
        d.say(); // calling default method
        d.sayMore("I love code"); // calling abstract method
        Sayable3.sayLoader("I love Java"); // calling static method
    }

    @Override
    public void sayMore(String msg) { // implementing abstract method
        System.out.println(msg);
    }
}

interface Sayable3{
    // default method
    default void say() {
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);

    // static method
    static void sayLoader(String msg){
        System.out.println(msg);
    }
}

abstract class AbstractClass{
    public AbstractClass(){ // constructor
        System.out.println("You can create constructor in abstract class");
    }
    abstract int add(int a, int b); // abstract method
    int sub(int a, int b){ // non-abstract method
        return a-b;
    }
    static int multiply(int a, int b) { // static method
        return a*b;
    }
}
class AbstractTest extends AbstractClass{

    @Override
    int add(int a, int b) { // implementing abstract method
        return a+b;
    }

    public static void main(String[] args) {
        AbstractTest a= new AbstractTest();
        int result1 = a.add(20, 10); // calling abstract method
        int result2 = a.sub(20, 10); // calling non-abstract method
        int result3 = AbstractClass.multiply(20, 10); // calling static method

        System.out.println("Addition: "+result1);
        System.out.println("Subtraction: "+result2);
        System.out.println("Multiplication: "+result3);
    }
}
