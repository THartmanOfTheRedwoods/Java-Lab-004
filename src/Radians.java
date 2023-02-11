import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        return Math.toRadians(degrees);
    }

    public static double toDegrees(double radians) {
        return Math.toDegrees(radians);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        double radians1 = toRadians(degrees);
        System.out.println(degrees + " degrees is equal to " + radians1 + " radians.");
        System.out.println("(Using Math.toRadians: " + Math.toRadians(degrees) + " radians)");

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians2 = Double.valueOf(scanner.nextLine());

        degrees = toDegrees(radians2);
        System.out.println(radians2 + " radians is equal to " + degrees + " degrees.");
        System.out.println("(Using Math.toDegrees: " + Math.toDegrees(radians2) + " degrees)");
    }
}
