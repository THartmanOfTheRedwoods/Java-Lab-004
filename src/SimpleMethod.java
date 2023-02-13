/**
 * @author Trevor Hartman
 * @author Michael Thoreson
 *
 * @since 1.0
 */

public class SimpleMethod {
    // Put your method code here

public static void square(int number) {
        double x = number;
        System.out.println(Math.pow(x, 2));
}
    public static void main(String[] args) {
        // This is the method call, create the square method.
        square(25);
    }
}
