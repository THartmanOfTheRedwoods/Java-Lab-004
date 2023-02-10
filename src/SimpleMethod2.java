/**
 *
 * @author Trevor Hartman
 * @author Katie Logefeil
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int num){
        return num * num;
    }


    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int result = square(num);
        // Put the result System.out code here.
        System.out.println("The result of squaring "  + num +  " is "  + result);
    }
}
