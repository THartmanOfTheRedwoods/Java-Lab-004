import java.util.Scanner;

public class Radians {

    public static double toRadians(int degrees) {
        return (degrees * Math.PI / 180);
    }

    public static double toDegrees(double radians) {
        return (radians*180/Math.PI);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        double result = toRadians((int) degrees);
        System.out.println(result);

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        double result2 = toDegrees(radians);
        System.out.println(result2);
    }
}
