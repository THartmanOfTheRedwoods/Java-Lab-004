/**
 *
 * @author Trevor Hartman
 * @author Aaron Johnson
 *
 * @since Version 1.0
 */
import java.util.Scanner;
import java.lang.Math;

public class SimpleMethod3 {

    /*
    NOTE: You can create multiple methods with the same name and different return
          types or parameters (Overloading methods).
          Overloaded methods can even call each-other, but you'll have to type
          the arguments correctly and cast upon return.
    */
    public static int square(int number) {
        // Put your code here
        int b = (int)Math.pow(number, 2.0);
        return b;
    }

    public static double square2(double number) {
         //Put your code here
        double g = Math.pow(number, 2.0);
        return g;
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
        double result2 = square2(input2);
        System.out.printf("The square of %f is %f%n", input2, result2);
    }
}
