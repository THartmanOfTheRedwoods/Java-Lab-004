/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */

public class SimpleMethod {
    // Put your method code here
    public static double square(double sqr) {
        // Creates publicly accessible, static, return type double, method named "square"
        // with return variable type double, named "sqr"

        System.out.println(Math.pow(sqr,2)); // Outputs the results of squaring sqr

        return(sqr); // returns value from previous line to start of method? Added at advisement of IDE
    }
    public static void main(String[] args) {
        // This is the method call, create the square method.

        square(25); // calls method "square" which returns the results of squaring25 = 25^2=625
    }
}

