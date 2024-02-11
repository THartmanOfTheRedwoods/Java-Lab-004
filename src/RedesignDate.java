public class RedesignDate {

    public static void printAmerican(String day, int date, String month, int year ) {
        System.out.printf("%s, %s %d, %d\n", day, month, date, year);
    }
    public static void printEuropean(String day, int date, String month, int year ) {
        System.out.printf("%s, %d %s %d", day, date, month, year);
    }
    public static void main(String[] args) {

        printAmerican("Saturday",10, "February", 2024 );
        printEuropean("Saturday", 10, "February", 2024);
    }
}