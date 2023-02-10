/**
 *
 * @author Trevor Hartman
 * @author Aaron Johnson
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
         //Put your code here
        double radiansResult = degrees * 3.141592653589793 / 180.0;
        return radiansResult;
    }

    public static double toDegrees(double radians) {
        // Put your code here
        double degreesResult = radians * 180.0 / 3.141592653589793;
        return degreesResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        // Add System.out, your method call, and Math.toRadians call here
        double result1 = toRadians(degrees);
        System.out.printf("Your degrees in radians is %f%n", result1);

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        // Add System.out, your method call, and Math.toDegrees call here
        double result2 = toDegrees(radians);
        System.out.printf("Your radians in degrees is %f%n", result2);
    }
}
