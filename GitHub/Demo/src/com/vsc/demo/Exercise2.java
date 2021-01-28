package com.vsc.demo;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            if (i == 1 || i == size) {
                printGlassesBorder(size);
            } else {
                printGlassesInnerPart(size);

                double middleRounded = Math.ceil(size / 2.0);
                if (middleRounded == i) {
                    printMiddleFrame(size);
                } else {
                    printSpaces(size);
                }

                printGlassesInnerPart(size);
                System.out.println();
            }
        }
    }

    public static void printGlassesBorder(int size) {
        for (int j = 1; j <= (size * 2); j++) {
            System.out.print("*");
        }

        printSpaces(size);

        for (int j = 1; j <= (size * 2); j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printGlassesInnerPart(int size) {
        System.out.print("*");
        for (int i = 1; i <= (size * 2) - 2; i++) {
            System.out.print("/");
        }
        System.out.print("*");
    }

    public static void printSpaces(int size) {
        for (int j = 1; j <= size; j++) {
            System.out.print(" ");
        }
    }

    public static void printMiddleFrame(int size) {
        for (int j = 1; j <= size; j++) {
            System.out.print("|");
        }
    }
}
