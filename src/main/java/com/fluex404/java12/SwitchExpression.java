package com.fluex404.java12;

import com.fluex404.java14.SwitchExpressEnchancments;

public class SwitchExpression {
    enum DAY_TYPE{
        MONDAY, FRIDAY, SUNDAY, TUESDAY
    };

    public static void main(String[] args) {

        DAY_TYPE day = DAY_TYPE.FRIDAY;

        int numLetter = switch (day){
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            default -> "Invalid Date".length();
        };
        System.out.println(numLetter);
    }
}
