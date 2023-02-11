public class SimpleMethod {
    public static void square(int num) {
        int result = num * num;
        System.out.println("The result of squaring " + num + " is " + result);
    }
    public static void main(String[] args) {
        // This is the method call, create the square method.
        square(25);
    }
}
