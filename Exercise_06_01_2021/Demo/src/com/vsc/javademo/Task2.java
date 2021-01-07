package com.vsc.javademo;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int firstNumber = input.nextInt();
            int secondNumber = input.nextInt();

            int result = firstNumber + secondNumber;

            System.out.println("The sum is " + result);

            if (secondNumber == 0) {
                break;
            }
        }
    }
}
