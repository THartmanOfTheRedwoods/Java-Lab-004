public class RedesignDate {

    public static void printAmerican(String day, String month, int date, int year) {
        System.out.println(day + "," + month + " " + date + ", " + year);

    }

    public static void printEuropean(String day, String month, int date, int year) {
        System.out.println(day + " " + date + " " + month + ", " + year);

    }
    public static void main(String[] args) {
        String day = "Saturday";
        String month = "February";
        int year = 2024;
        int date = 10;

        printAmerican(day, month, date, year);
        printEuropean(day, month, date, year);
    }
}