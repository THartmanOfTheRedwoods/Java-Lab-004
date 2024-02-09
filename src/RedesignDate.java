/**
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * February 6, 2024
 *
 */
public class RedesignDate{
public static void printAmerican(String day, int date, String month, int year) {
    System.out.print(day+", ");
    System.out.print(month + " ");
    System.out.print(date+", ");
    System.out.print(year);
}
public static void printEuropean(String day, int date, String month, int year) {
    System.out.println();
    System.out.print(day+", ");
    System.out.print(date + " ");
    System.out.print(month+", ");
    System.out.print(year);
}
    public static void main(String[] args) {
    String day = "Tuesday";
    String month = "February";
    int date = 6;
    int year = 2024;
    printAmerican(day,date,month,year);
    printEuropean(day,date,month,year);
    }
}
