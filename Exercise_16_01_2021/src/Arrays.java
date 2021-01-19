public class Arrays {
    /*
        Даден е масив с цели числа.
        Напишете метод, който създава и връща нов масив,
        първата половина на който е оригиналният масив, а втората половина
        - оригиналният, но в обратен ред.
        Изведете новия масив в конзолата.
        Пример:
                 0  1  2  3
         input: [1, 2, 3, 4] |
                 0  1  2  3  | 4  5   6  7
        output: [1, 2, 3, 4, | 4, 3 , 2, 1]
        7
        -
        4 5 6 7
        3 2 1 0

     */
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4, 5, 6, 7};

        print(convertToMirrorArray(numbers));
    }

    public static int[] convertToMirrorArray(int[] input){
        int[] mirrorArray = new int[input.length * 2];
        //first half [1,2,3,4 .....]
        for (int i = 0; i < input.length; i++) {
            mirrorArray[i] = input[i];
        }

        for (int i = input.length; i < input.length * 2; i++) {
            //input.length * 2 - 1 -----> last index
            mirrorArray[i] = input[(input.length * 2 - 1) - i];
        }
        return mirrorArray;
    }

    public static void print(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
