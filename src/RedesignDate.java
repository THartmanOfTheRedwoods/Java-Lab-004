public class RedesignDate {

    static String day = "Tuesday";
    static String month = "February";
    static int date = 6;
    static int year = 2024;

    public static void main(String[] args) {
        printAmerican();
        printEuropean();
    }

    public static void printAmerican() {
        System.out.printf("The date in American Format is %s, %s %02d, %d", day, month, date, year);
        System.out.println();
    }

    public static void printEuropean() {
        System.out.printf("The date in European Format is %s, %d, %s %02d", day, year, month, date);
        System.out.println();
    }
}
