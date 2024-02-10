import java.util.*;

public class RedesignDate {
    public static void printAmerican(int day, int date, int month, int year) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] monthsOfYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        String dayOfWeek = daysOfWeek[new GregorianCalendar(year, month - 1, date).get(Calendar.DAY_OF_WEEK) - 1];
        String monthOfYear = monthsOfYear[month - 1];

        System.out.println(dayOfWeek + ", " + monthOfYear + " " + date + ", " + year);
    }

    public static void printEuropean(int day, int date, int month, int year) {
        System.out.println(date + " " + month + ", " + year);
    }

    public static void main(String[] args) {

        printAmerican(2, 10, 2, 2024); // Example invocation


        printEuropean(2, 10, 2, 2024); // Example invocation
    }
}
