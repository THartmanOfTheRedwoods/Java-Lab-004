import java.util.*;
public class RedesignDate {

    public static void main(String[] args) {
        printAmerican("Saturday", 10, "February", 2024);

        printEuropean("Saturday", 10, "February", 2024);
    }

    public static void printAmerican(String day, int date, String month, int year) {

        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + ", " + date + " " + month + ", " + year);
    }
}
