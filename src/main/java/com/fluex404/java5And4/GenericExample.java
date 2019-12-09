package com.fluex404.java5And4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * The type parameters naming convertions are important to learn generics throughly.
 * The common type parameters are as follows
 *
 * 1. T - Type
 * 2. E - Element
 * 3. K - Key
 * 4. N - Number
 * 5. V - Value
 */
public class GenericExample {

    public static <E> void printArray(E[] elements){
        for(E element : elements) {
            System.out.println(element);
        }
    }

    // creating a method that accepts only child class of Shape
    public static void drawShapes(List<? extends Shape> lists) {
        for(Shape s : lists) {
            s.draw(); // calling method of Shape class by child class instance
        }
    }

    // upper bounded wilcard
    public static Double add(List<? extends Number> num){
        double sum = 0.0;
        for(Number n : num) {
            sum+=n.doubleValue();
        }
        return sum;
    }

    // unbounded wildcard
    public static void display(List<?> list) {
        for(Object o : list) {
            System.out.println(o);
        }
    }
    // lower bounde wildcard
    public static void addNumbers(List<? super Integer> list) {
        for(Object n : list) {
            System.out.println(n);
        }
    }

    public static void main(String... args) {
        List<String> list = new ArrayList<String>();

        list.add("Isa");
        list.add("Rara");
//        list.add(32); // compile time error

        String s = list.get(1); // type casting is not required
        System.out.println("element is: "+s);

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        MyGen<Integer> m = new MyGen<Integer>();
        m.add(2);
//        m.add("Isa"); // compile time error

        System.out.println(m.get());

        // generic static, n non - static
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'I','S','A'};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);

        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);

        // upper bounded wilcard
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        System.out.println("dispaying the sum = "+add(l1));

        List<Double> l2 = new ArrayList<Double>();
        l2.add(30.0);
        l2.add(40.50);
        System.out.println("displaying the sum = "+add(l2));

        List<Integer> ll1 = Arrays.asList(1, 2, 3);
        System.out.println("displaying the integer values");
        display(ll1);
        List<String> ll2 = Arrays.asList("Isa", "Rara");
        System.out.println("displaying the String values");
        display(ll2);

        List<Integer> list3 = Arrays.asList(1, 2, 3);
//        List<Number> list4 = Arrays.asList(1.0, 2.0, 3.0);
        System.out.println("displaying the integer values");
        addNumbers(list3);
        System.out.println("displyaing the Number values");
//        addNumbers(list4);
    }
}

class MyGen<T> {
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
        return obj;
    }
}

// willdraw
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw() {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    void draw() {
        System.out.println("drawing circle");
    }
}

