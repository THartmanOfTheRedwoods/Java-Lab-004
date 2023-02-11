import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        final double PI = 3.14159265358979323846;
        return degrees * PI / 180;
    }

    public static double toDegrees(double radians) {
        final double PI = 3.14159265358979323846;
        return radians * 180 / PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        System.out.println("toRadians. " + toRadians(degrees));
        System.out.println("Math.toRadians. " + Math.toRadians(degrees));

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        System.out.println("toDegrees. " + toDegrees(radians));
        System.out.println("Mah.toDegrees. " + Math.toDegrees(radians));
    }
}
