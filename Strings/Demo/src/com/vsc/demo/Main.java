package com.vsc.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        minesweeper();
    }

    public static void testing() {
        String firstName = "PEsho";
        String lastName = "Ivanov";
        String middleName = null;
        String petName = "";

        String fullName = firstName.concat(" ").concat(lastName);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(i).append(" ");
        }

        String result = stringBuilder.toString();
        System.out.println(result);

        System.out.println(result.charAt(6));

        System.out.println(result.length());

        for (int i = 0; i < result.length(); i++) {
            System.out.println(result.charAt(i));
        }

        System.out.println(firstName);
        System.out.println(petName);
        System.out.println(middleName);
    }

    public static void charAt() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));
        System.out.println(name.length());
    }

    public static void indexOf() {
        String name = "Gosho";
        int sHo = name.indexOf("sHo");
        System.out.println(sHo);
    }

    public static int firstPosition(String text, String part) {
        if (text == null || part == null) {
            return -5;
        } else if (text.length() == 0) {
            return -3;
        } else {
            return text.indexOf(part);
        }
    }

    public static void equals() {
        String name1 = "gosho";
        String name2 = "gosho";

        System.out.println(name1.equals(name2));
    }

    public static void javaGoodChoice() {
        Scanner input = new Scanner(System.in);
        String favouriteLanguage = input.nextLine();

        if (favouriteLanguage.equalsIgnoreCase("Java")) {
            System.out.println("Good choice!");
        } else {
            System.out.println("Try again!");
        }
    }

    public static void format() {
        String name = "Ivan";
        int age = 24;
        String petName = "rocky";
        boolean isEngaged = true;

        System.out.printf("%s is %d years old; his pet's name is %s and he is engaged: %s %n", name, age, petName, isEngaged + "");

        System.out.printf("%.5f", 234.23825435);
    }

    public static void split() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur tempus, ex sed ullamcorper finibus, lectus neque vestibulum elit, vitae efficitur sapien urna in arcu. Quisque pulvinar, augue vitae tincidunt tincidunt, purus lectus dapibus lectus, vitae pellentesque nibh ante at nisl. Curabitur mollis libero vulputate odio varius interdum. Duis nisi metus, luctus eget congue eget, mollis at est. Curabitur gravida ornare tellus, eget sodales nisl auctor eu. Morbi commodo id metus sed auctor. Morbi non diam nulla. Donec sollicitudin imperdiet sagittis. Nam ut malesuada dolor, non consectetur lacus.";
        String[] words = text.split(" ");

        System.out.println(Arrays.toString(words));
    }

    public static void replace() {
        String text = "I like Php";
        String replacedString = text.replace("Php", "Java");

        System.out.println(text.concat(" -> ").concat(replacedString));
    }

    public static void substring() {
        String text = "I like Php";
        String substring = text.substring(text.indexOf("P"), 10);

        System.out.println(substring);
    }

    public static String createMail(String[] data) {
        StringBuilder mail = new StringBuilder();
        for (String row : data) {
            mail.append(row).append(System.lineSeparator());
        }

        return mail.toString();
    }

    public static String[] wordify(String text) {
        return text.split(" ");
    }

    public static void minesweeper() {
        Scanner scanner = new Scanner(System.in);
        boolean[][] field = new boolean[3][3];

        // |x|o|o|
        // |o|o|o|
        // |o|x|o|

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = scanner.nextBoolean();
            }
        }

        for (boolean[] row : field) {
            for (boolean col : row) {
                // col == true
                if (col) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
