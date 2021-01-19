public class Task6 {
    public static void main(String[] args) {

        boolean[][] mines = {
                {true, true, false},
                {true, false, false},
                {false, false, true},
        };

        printMatrix(visualise(mines));
    }

    public static char[][] visualise(boolean[][] matrix) {
        //the new char matrix, corresponding to the boolean matrix
        char[][] visualised = new char[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                //if the element from the boolean matrix is true
                // (there is a bomb on these coordinates)
                //set the corresponding element from the char matrix to 'x'
                // (indicator of bomb)
                if (matrix[i][j]) {
                    visualised[i][j] = 'x';
                }
                //if the element from the boolean matrix is false
                // (there is NO bomb on these coordinates)
                //set the corresponding element from the char matrix to 'o'
                // (indicator of NO bomb)
                else {
                    visualised[i][j] = 'o';
                }
            }
        }
        return visualised;
    }

    //helper method
    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


