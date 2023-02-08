import java.util.Scanner;

public class Radians {

    public static void toRadians(double degrees) {
        double radianResult = degrees * Math.PI / 180;
        System.out.println(radianResult);
        // Pur your code here
    }

    public static void toDegrees(double radians) {
        double degreeResult = radians * 180 / Math.PI;
        System.out.println(degreeResult);
        // Put your code here
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        toRadians(degrees);
        System.out.println(Math.toRadians(degrees));
        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        toDegrees(radians);
        System.out.println(Math.toDegrees(radians));

        // Add System.out, your method call, and Math.toDegrees call here
    }
}