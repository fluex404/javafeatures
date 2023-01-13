package com.fluex404.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.UK);
        System.out.println(nf.format(1000.98));
        System.out.println(nf.format(1000000));
        System.out.println(nf.format(100000000));
    }
}
