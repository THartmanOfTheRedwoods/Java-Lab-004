/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class SimpleMethod3 {

    /*
    NOTE: You can create multiple methods with the same name and different return
          types or parameters (Overloading methods).
          Overloaded methods can even call each-other, but you'll have to type
          the arguments correctly and cast upon return.
     */
    public static int square(int sqr) {
        // Creates publicly accessible (public), static, return type int, method named square
        // returns variable "sqr," type int

        sqr = (int) Math.pow(sqr,2); // Squares sqr using function Math.pow
        // the inclusion of "(int)" tells compiler I REALLY DO want to convert from double (.sqrt) to an integer

        return (sqr); // returns value from previous line to start of method? Added at advisement of IDE
    }


    public static double square(double sqr) {
        // Creates publicly accessible (public), static, return type double, method named square
        // returns variable "sqr," type int

        sqr = Math.pow(sqr,2); // Squares sqr using function Math.pow


        return(sqr); // returns value from previous line to start of method? Added at advisement of IDE
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to square: ");
        /* Integers Used */
        int input = Integer.valueOf(scanner.nextLine());
        int result = square(input);
        System.out.printf("The square of %d is %d%n", input, result);

        System.out.print("What number would you like to square: ");
        /* Doubles used  */
        double input2 = Double.valueOf(scanner.nextLine());
        double result2 = square(input2);
        System.out.printf("The square of %f is %f%n", input2, result2);
    }
}