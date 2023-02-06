/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) { // Declares publicly accessible, Static, double method
        // named "toRadians"
        // Output is a type double variable called "degrees"

        // Pur your code here

        degrees = degrees*180/3.14; // performs degrees to radians computation, returns output to variable "degrees"

        //degrees = (double) Math.toRadians(degrees); // Tests output of Degrees to Radians

        return(degrees); // returns "degrees" to start of method
    }

    public static double toDegrees(double radians) { // Declares publicly accessible, Static, double method
        // named "toDegrees"
        // Output is a type double variable called "radians"

        // Put your code here

        radians = radians*3.14/180; // performs radians to degrees computation, returns output to variable "radians"

        //radians = (double) Math.toDegrees(radians); // Tests output of Radians to Degrees

        return(radians); // returns "radians" to start of method

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here

        System.out.println("Degrees converted to radians: " + toDegrees(degrees));
        // Calls method "toDegrees" with input variable "degrees" to convert Radians to Degrees
        // Outputs results of method "toDegrees"

        System.out.println("Radians converted to Degrees: " + toRadians(radians));
        // Calls method "toRadians" with input variable "radians" to convert Degrees to Radians
        // Outputs results of method "toRadians"




    }
}
