package com.fluex404.java7;

import java.sql.SQLOutput;

public class MultipleExceptionExample {
    public static void main(String[] args) {
        try{
            int array[] = new int[10];
            array[10] = 30/0;
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // one more!
        try{
            int array[] = new int[10];
            array[10] = 30/0;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        // one more!
        try {
            int array[] = new int[10];
            array[10] = 30/0;
        }catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
