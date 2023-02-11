/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        // Pur your code here

        double convertedDegrees = (degrees * (Math.PI) / 180.0);

        return convertedDegrees;
    }

    public static double toDegrees(double radians) {
        // Put your code here

        double convertedRadians= (radians * 180.0) / Math.PI;

        return convertedRadians;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        double convertedDegrees = toRadians(degrees);
        System.out.printf("The conversion of %f is %f%n", degrees, convertedDegrees);


        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here

        double convertedRadians = toDegrees(radians);
        System.out.printf("The conversion of %f is %f%n", radians, convertedRadians);
    }
}
