import java.util.Scanner;

public class Task5 {
    //a constant for the numbers of rows and columns of the matrix
    //you can change the size of the matrix by only changing this number
    private static final int MATRIX_SIZE = 4;

    /*      0 1 2 3

       0    1 2 3 0
       1    4 5 6 1
       2    7 8 9 2
       3    4 6 7 2

       1st diagonal -> 1 5 9 2
       2nd diagonal -> 0 6 8 4
     */

    public static void main(String[] args) {
        //input the matrix
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        //find diagonals with functions and assign them to variables
        int[] mainDiagonal = findMainDiagonal(matrix);            //main diagonal = [1, 5, 9, 2]
        int[] secondaryDiagonal = findSecondaryDiagonal(matrix);  //secondary diagonal = [0, 6, 8, 4]

        //print diagonals
        printArray(mainDiagonal);
        System.out.println();
        printArray(secondaryDiagonal);
        System.out.println();

        //find sum of all numbers from the diagonals and print it
        //sumArray(mainDiagonal) = 1 + 5 + 9 + 2
        //sumArray(secondaryDiagonal) = 0 + 6 + 8 + 4
        int sum = sumArray(mainDiagonal) + sumArray(secondaryDiagonal);
        System.out.println("sum: " + sum);
    }

    public static int[] findMainDiagonal(int[][] matrix){
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                //if a number is on row and column with same indexes, it is from the diagonal
                if(i == j){
                    //put item in the result array
                    diagonal[i] = matrix[i][j];
                }
            }
        }
        return diagonal; //so that we can use its values later
    }

    public static int[] findSecondaryDiagonal(int[][] matrix){
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                //if a number is on row and column with indexes which sum is equal to
                //the biggest index, it is from the secondary diagonal
                if(i + j == matrix.length - 1){
                    //put item in the result array
                    diagonal[i] = matrix[i][j];
                }
            }
        }
        return diagonal; //so that we can use its values later
    }

    //helper methods:
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //you can use this to see how your matrix looks like
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
