public class RedesignDate {

    // Part 1

    public static String printAmerican(String day, int date, String month, int year) {
        String aTemplate = "%s, %s %dth, %d";
        System.out.printf(aTemplate, day, month, date, year);
        return "";

    }

    public static String printEuropean(String day, int date, int month, int year) {
        String bTemplate = "%s, %02d.%02d.%d";
        System.out.printf(bTemplate, day, date, month, year);
        return "";

    }

    public static void twoLine() {
        System.out.println("\n");

    }

    public static void main(String[] args) {
        printAmerican("Wednesday", 7, "February", 2024);
        twoLine();
        printEuropean("Wednesday", 07, 02, 2024);


    }

}