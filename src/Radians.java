/**
 * @author Trevor Hartman
 * @author Michael Thoreson
 *
 * @since 1.0
 */
import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        double dRadians = (degrees / 180 * 3.14159);
        return dRadians;
    }

    public static double toDegrees(double radians) {
        double rDegrees = (radians * 180 / 3.14159);
        return rDegrees;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        System.out.printf("My code says %f, Math.toRadians says %f%n", toRadians(degrees),Math.toRadians(degrees));

        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        System.out.printf("My code says %f, Math.toDegrees says %f%n", toDegrees(radians),Math.toDegrees(radians));
        // Add System.out, your method call, and Math.toDegrees call here
    }
}
