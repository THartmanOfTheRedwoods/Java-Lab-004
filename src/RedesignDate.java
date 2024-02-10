

public class RedesignDate {
    public static void main(String[] args) {
        printAmerican("Friday", 26, "January", 2024);

        printEuropean(26, "Jaunuary", 2024);
    }
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + "," + month + " " + date + "," + year );
    }
    public static void printEuropean(int date, String month, int year) {
        System.out.println( date + "," + month + " " + year);
    }
}
