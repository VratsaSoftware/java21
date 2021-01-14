package com.vsc.javademo;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        int[][] movieScores = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}
        };

        exercise1(movieScores);
        exercise2(movieScores, 2);
        exercise3(movieScores, 0);
        exercise4(movieScores);
    }

    public static void exercise1(int[][] movieScores) {
//        for (int[] criticScores : movieScores) {
            System.out.println(Arrays.deepToString(movieScores));
//        }
    }

    public static void exercise2(int[][] movieScores, int criticIndex) {
        double scoresSum = 0;
        for (int score : movieScores[criticIndex]) {
            scoresSum += score;
        }

        System.out.println(scoresSum / movieScores[criticIndex].length);
    }

    public static void exercise3(int[][] movieScores, int minScore) {
        int count = 0;
        for (int[] criticScores : movieScores) {
            for (int score : criticScores) {
                if (score > minScore) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void exercise4(int[][] movieScores) {
        int[] scores = flatten(movieScores);
        bubbleSort(scores);
        System.out.println(Arrays.toString(scores));
    }

    public static int[] flatten(int[][] movieScores) {
        int[] scores = new int[movieScores.length * movieScores[1].length];
        for (int i = 0; i < movieScores.length; i++) {
            for (int j = 0; j < movieScores[i].length; j++) {
                scores[(i * 4) + j] = movieScores[i][j];
            }
        }
        return scores;
    }

    public static void bubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    // swap the elements!
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
