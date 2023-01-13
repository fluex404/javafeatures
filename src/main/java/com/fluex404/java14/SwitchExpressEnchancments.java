package com.fluex404.java14;

public class SwitchExpressEnchancments {

    enum DAY_TYPE{
        MONDAY, FRIDAY, SUNDAY, TUESDAY
    };

    public static void main(String[] args) {

        DAY_TYPE day = DAY_TYPE.FRIDAY;

        int numLetter = switch (day){
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            default -> {
                int result = "Invalid Date".length();
                yield result;
            }
        };
        System.out.println(numLetter);
    }
}
