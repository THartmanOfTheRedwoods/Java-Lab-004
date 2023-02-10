import java.util.Scanner;

public class Radians {

    public static <ADD TYPE> toRadians(<ADD TYPE> degrees) {
        // Pur your code here
        int PI = 3.14;
        int radians = degrees * PI / 180
        int degrees = radians * 180 / PI

    }

    public static <ADD TYPE toDegrees(<ADD TYPE> radians) {
        // Put your code here
        return null;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
    }
}
