package com.fluex404.java8;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;

        // without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing "+width);
            }
        };
        d.draw();

        // With lambda
//        Drawable2 d2 = () -> {
//            System.out.println("Drawing "+width);
//        };
        Drawable2 d2 = () -> System.out.println("Drawing "+width);
        d2.draw();

        Sayable s = () -> ("I have nothing to say");//{return "I have noting to say";};
        System.out.println(s.say());

        // Lambda expression with single parameter.
        Sayable2 s2 = name -> ("Hello, "+name);// {return "Hello, "+name;};
        System.out.println(s2.say("Isa"));

        // Multiple parameter in lambda expression
        Addable ad = (a, b) -> (a+b);
        System.out.println(ad.add(10, 30));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a+b);
        System.out.println(ad2.add(100, 300));

        // For-Each
        List<String> list = new ArrayList<>();
        list.add("Isa");
        list.add("Rara");
        list.add("Tara");
        list.add("Nara");

        list.forEach(n -> System.out.println(n));

        // You can pass mutiple statements in lambda expression
        Sayable2 s3 = name -> {
            String str = "I would like to say, ";
            String str2 = str+name;
            return str2;
        };
        System.out.println(s3.say("I love you for Her"));

        // Thread Example without lambda
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        // Thread Example with lambda
        Runnable r2 = () -> {
            System.out.println("Thread2 is running...");
        };
        Thread t2 = new Thread(r2);
        t2.start();

        // Adding Products
        List<Product> products = Arrays.asList(
                new Product(1, "HP Laptop", 25000f),
                new Product(3, "Keyboard", 300f),
                new Product(2, "Dell Mouse", 15f)
        );
        System.out.println("Sorting on the basis of name...");
        //implementing lambda expression
        Collections.sort(products, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        products.forEach(product -> System.out.println(product.id+" "+product.name+" "+product.price));

        List<Product> products2=new ArrayList<Product>();
        products2.add(new Product(1,"Samsung A5",17000f));
        products2.add(new Product(3,"Iphone 6S",65000f));
        products2.add(new Product(2,"Sony Xperia",25000f));
        products2.add(new Product(4,"Nokia Lumia",15000f));
        products2.add(new Product(5,"Redmi4 ",26000f));
        products2.add(new Product(6,"Lenevo Vibe",19000f));

        // using lambda to filter data
        Stream<Product> filtered_data = products2.stream().filter(
                p -> p.price > 20000
        );
        // using lambda to iterate though collection
        filtered_data.forEach(p -> System.out.println(p.name+":"+p.price));

        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("click");
        b.setBounds(80, 100, 70, 30);

        // lambda expression implementting here.
        b.addActionListener(e -> {tf.setText("hello swing");});
        JFrame f = new JFrame();
        f.add(tf);f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}

interface Drawable {
    void draw();
}
@FunctionalInterface // It is optional
interface Drawable2 {
    void draw();
}
interface Sayable{
    String say();
}
// single parameter
interface Sayable2{
    String say(String name);
}
// multi parameter
interface Addable{
    int add(int a, int b);
}
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}