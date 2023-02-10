/**
 *
 * @author Trevor Hartman
 * @author Aaron Johnson
 *
 * @since Version 1.0
 */
import java.util.Scanner;
public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int n) {
        return n * n;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner s = new Scanner(System.in);
        // Modify the below call to assign the result of the method call to a variable.
        System.out.print("Please enter an integer to be squared: ");
        int input = s.nextInt();
        // Put the result System.out code here.
        int nSquared = square(input);
        System.out.print("Here's your integer squared: ");
        System.out.println(nSquared);
    }
}
