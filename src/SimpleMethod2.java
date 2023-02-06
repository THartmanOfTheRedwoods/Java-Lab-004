/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner; // Imports Scanner class

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
// Put your method code here
    public static int square(int sqr) {
        // Creates publicly accessible (public), static, return type int, method named square
        // returns variable "sqr," type int

        sqr = (int) Math.pow(sqr,2); // Squares variable "sqr" using function Math.pow
        // the inclusion of "(int)" tells compiler I REALLY DO want to convert from double (.sqrt) to an integer

        return(sqr); // returns value from previous line to start of method? Added at advisement of IDE
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        // Modify the below call to assign the result of the method call to a variable.

        Scanner in = new Scanner(System.in); // Declares a new Scanner variable named "in"
        // Declares new Scanner variable "in" as a "new" instance, takes input from class: System

        System.out.print("Input number to square: "); // Asks for input from user

        int line = in.nextInt(); // Declares variable "line" as type int
        // "line" is = variable "in," taking input, type integer, from Scanner

        int output = square(line); // declares new variable "output"
        // "output" is = to the results of method "square", when variable line is input into "square"

        // Put the result System.out code here.

        System.out.println(output); // variable output with "squares" results are output here

    }
}
