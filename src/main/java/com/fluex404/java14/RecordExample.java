package com.fluex404.java14;

public class RecordExample {
    public static void main(String[] args) {
        record Point(int x, int y){};

        Point p = new Point(10, 20);
        System.out.println(p);
//        p.x = 12;

    }
}
