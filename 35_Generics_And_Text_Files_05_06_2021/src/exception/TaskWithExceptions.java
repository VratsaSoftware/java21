package exception;

import exception.CustomException;

public class TaskWithExceptions {
    public static void main(String[] args) {
        int[] numberArray = new int[10];

        methodWithException();

//        try {
//            System.out.println("We are in the try block");
//            int number = numberArray[9];
//            throw new exception.CustomException("This exception was thrown because I was grumpy");
//        } catch (exception.CustomException e) {
//            System.out.println(e.getMessage());
//            System.out.println(Arrays.toString(e.getStackTrace()));
//            System.out.println("We are in the catch block");
//        } finally {
//            System.out.println("We are in the finally block");
//        }

        System.out.println("We are out of the try/catch block");
    }

    public static void methodWithException() {
        try {
            throw new CustomException("This exception was thrown because I was grumpy");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
