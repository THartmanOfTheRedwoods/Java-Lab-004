public class RedesignDate {

    static String hello = "Hello World!";
    static String day = "Saturday";
    static int date = 10;
    static String month = "Feburary";
    static int year = 2024;

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("American: " + day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("European: " + day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        System.out.println(hello);
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
}

