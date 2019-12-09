package com.fluex404.java5And4;

public class EnumExample {
    // defining the enum inside the class
    public enum Season {WINTER, SPRING, SUMMER, FALL}

    public static void main(String... args) {
        // traversing the enum
        for(Season s : Season.values()) {
            System.out.println(s);
        }



        System.out.println("Value of WINTER is "+Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is : "+Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is : "+Season.valueOf("SUMMER").ordinal());
    }
}

// if you put main() method inside the enum, you can runt he enum directly
enum Season{
    WINTER, SPRING, SUMMER, FALL;
    public static void main(String... args){
        Season s = Season.WINTER;
        System.out.println(s);
    }
}

/*
 * we can initialize the specific value to the enum constants by defining fields and constructors.
 * defining fields and constructors. As specified earlier, Enum can have fields, contructors, and methods
 */
class EnumExample2{
    enum Season{
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);

        private int value;
        private Season(int value){
            this.value = value;
        }
    }

    public static void main(String... args) {
        for(Season s  : Season.values()) {
            System.out.println(s +" "+s.value);
        }
    }
}







