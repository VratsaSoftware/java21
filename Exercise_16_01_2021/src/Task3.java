public class Task3 {
    public static void main(String[] args) {
        //use the method is mirror here to test it
        //and see what it returns
        int[] array = {1, 2, 3};
        int[] mirrorArray = {1, 2, 3, 2, 1};
        System.out.println(isMirror(array));
        System.out.println(isMirror(mirrorArray));
    }

    public static boolean isMirror(int[] numbers) {
        //initially we assume that the array is mirror
        boolean isMirror = true;

        //for every number from the first half of the array,
        //we check if it is equal to its corresponding number
        //from the second half of the array
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {

                //if even one number from the first part isn't equal to
                //its corresponding, then the array isn't mirror
                isMirror = false;

                //we can break the cycle, because we've proved that
                //the array isn't mirror
                break;
            }
        }
        //return the value, so we can use it later in the code
        return isMirror;
    }
}
