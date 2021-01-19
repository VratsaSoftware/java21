import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //create a fibonacci sequence and print it
        printArray(fibonacci(number));
    }

    public static int[] fibonacci(int number){
        //create the fibonacci sequence array
        int[] sequence = new int[number];
        //first and second elements are fixed
        sequence[0] = 0;
        sequence[1] = 1;
        //each element (index = i) after the first two is equal to the
        //sum of the previous one (index = i - 1) and the one before that (index = i - 2)
        for (int i = 2; i < number; i++){
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
        //return the sequence, so we can use it later
        return sequence;
    }

    //helper function:
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
