package com.fluex404.java7;

public class StringInSwitchStatementExample {
    public static void main(String[] args) {
        String game = "Cricket";
        switch(game){
            case "Hockey":
                System.out.println("Let's play Hockey");
                break;
            case "Cricket":
                System.out.println("Let's play Cricket");
                break;
            case "Football":
                System.out.println("Let's play Football");
                break;
        }
        String game2 = "Card-Games";
        switch(game2) {
            case "Hockey": case "Cricket": case "FootBall":
                System.out.println("This's a outdoor game");
                break;
            case "Chess": case"Card-Games": case "Puzzles": case"Indoor basketball":
                System.out.println("This is a indoor game");
                break;
            default:
                System.out.println("What's game it is? ");
        }
    }
}
