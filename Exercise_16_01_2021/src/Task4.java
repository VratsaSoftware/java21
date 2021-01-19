public class Task4 {
    public static void main(String[] args) {
        int[] array = {3,4,5,1,4};
        printArray(convertArray(array));
    }

    public static int[] convertArray(int[] input){
        int[] result = new int[input.length];
        //we go through the whole input array
        for (int i = 0; i < input.length; i++){
            if ( i == 0 || i == input.length - 1 ){
                //if we are at the first element (i=0) or at the
                //last element (i=length - 1), the resulting element should be
                //equal to the input
                result[i] = input[i];
            }else {
                //else the element is previous + next
                result[i] = input[i - 1] + input[i + 1];
            }
        }
        return result;
    }

    //you can use this to test the method
    //helper method:
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
