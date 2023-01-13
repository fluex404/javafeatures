package com.fluex404.java14;

public class PatternMachingForInstance {
    public static void main(String[] args) {
        Object obj = 10;

        if(obj instanceof String s){
            System.out.println(s.length());
            System.out.println(s);
            System.out.println(obj);
        } else if(obj instanceof Integer i){
            System.out.println(i);
        }
    }
}
