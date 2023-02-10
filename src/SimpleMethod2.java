import java.util.Scanner;

/**
 * @author Trevor Hartman
 * @author Ander Stanley-Camba
 *
 * @since Version 1.0
 */

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int arg){
        return arg * arg;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner sc = new Scanner(System.in);
        // Modify the below call to assign the result of the method call to a variable.

        String input = sc.nextLine();
        try {
            int result = square(Integer.parseInt(input));
            // Put the result System.out code here.
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("That's not a number!");
        }
        finally {
            main(null);
        }




        }

}
