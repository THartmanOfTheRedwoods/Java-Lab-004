/**
 * @author Trevor Hartman
 * @author Michael Thoreson
 *
 * @since 1.0
 */
import java.util.Scanner;
public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
public static int square(int number) {
    double x = (double)number;
    x = Math.pow(x, 2);
    return (int)x;}
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter integer you want to square:");
        int input = myScanner.nextInt();
        int output = square(input);
        System.out.println(output);
        // Put the result System.out code here.
    }
}
