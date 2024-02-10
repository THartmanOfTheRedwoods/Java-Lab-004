public class RedesignDate {

    public static void printAmerican(String day, String month, int date, int year) {
        System.out.printf("%s, %s %dth, %d\n", day, month, date, year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.printf("%s, %dth of %s, %d\n", day, date, month, year);
    }

    public static void main(String[] args) {
        String day = "Wednesday";
        String month = "February";
        int date = 7;
        int year = 2024;
        printAmerican(day, month, date, year);
        printEuropean(day, date, month, year);
    }
}
