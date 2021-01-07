package com.vsc.javademo;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        printMenu();

        double totalCost = 0D;
        while (true) {
            int age = input.nextInt();
            int drinkNumber = input.nextInt();

            if (drinkNumber == 0) {
                break;
            }

            if (age < 18) {
                System.out.println("Sorry, you are too young");
            } else {
                totalCost += getDrinkPrice(drinkNumber);
                System.out.println("Here is your " + getDrinkName(drinkNumber));
                System.out.println("Current cost is " + totalCost + "lv");
            }
        }

        System.out.println("Total cost is " + totalCost + "lv");
    }

    public static void printMenu() {
        System.out.println("1. Beer - 3.00lv");
        System.out.println("2. Whisky - 6.50lv");
        System.out.println("3. Vodka - 5.50lv");
        System.out.println("4. Rakia - 4.00lv");
    }

    public static String getDrinkName(int drinkNumber) {
        switch (drinkNumber) {
            case 1: return "Beer";
            case 2: return "Whisky";
            case 3: return "Vodka";
            case 4: return "Rakia";
            default: return "ERROR";
        }
    }

    public static double getDrinkPrice(int drinkNumber) {
        switch (drinkNumber) {
            case 1: return 3;
            case 2: return 6.5;
            case 3: return 5.5;
            case 4: return 4;
            default: return 0;
        }
    }
}
