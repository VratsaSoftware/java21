public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.test();
        //Usually if the code is synchronous
        //this line of code is going to be printed last
        //By using callbacks, we can avoid that process other things
        //while waiting for result
        System.out.println("Your request is being processed");
    }
}
