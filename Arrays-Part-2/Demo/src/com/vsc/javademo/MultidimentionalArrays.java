package com.vsc.javademo;

public class MultidimentionalArrays {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6, 234, 52},
                {7},
                {10, 11, 12, 12, 41, 6621, 6235, 246246, 235245, 56785678},
                {13, 14},
                {}
        };

        int[][] matrix2 = new int[2][6];


    }

    public static void printMatrixFor(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < matrix[i].length; j++) {
                int col = matrix[i][j] * 2 * 235;
                System.out.print(matrix[i][j] + " ");
                matrix[i][j] = 234234;
            }
            System.out.println();
        }
    }

    public static void printMatrixForeach(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void cube() {
        String[][][][] cube = {
                {
                        {},
                        {},
                        {}
                },
                {
                        {},
                        {},
                        {}
                },
                {
                        {},
                        {},
                        {}
                }
        };
    }
}
