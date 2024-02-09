public class RedesignDate {

    public static void printAmerican(String day, int date, String month, int year) {

        String americanDate = String.format("%s, %s %d, %d", day, month, date, year);
        System.out.println(americanDate);

    }

    public static void printEuropean(String day, int date, String month, int year) {

        String formattedDate = String.format("%s %d %s %d", day, date, month, year);
        System.out.println(formattedDate);

    }

    public static void main(String[] args) {

        printAmerican("Monday", 22, "July", 2019);

        printEuropean("Monday", 22, "July", 2019);

    }
}