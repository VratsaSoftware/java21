package com.vsc.javademo;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] array = {12, 15, 126, 235, -123, 2, 2, 2664};

        System.out.println(Arrays.toString(array));

        selectionSort(array);

        System.out.println(Arrays.toString(array));
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

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int temp;
            while (j > 0 && array[j - 1] > array[j]) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j = j - 1;
            }
        }
    }

    public static void selectionSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int minIndex = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            int temp;
            if (minIndex != j) {
                temp = array[minIndex];
                array[minIndex] = array[j];
                array[j] = temp;
            }
        }
    }
}
