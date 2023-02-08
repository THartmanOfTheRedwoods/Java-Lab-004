/**
 * @author Trevor Hartman
 * @author Mike Quist
 * @since Version 1.0
 */

import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int number) {
        return number * number;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        // Modify the below call to assign the result of the method call to a variable.
        // Put the result System.out code here.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to square: ");
        int number = scanner.nextInt();
        int result = square(number);
        System.out.println("The square of " + number + " is " + result);
    }
}
