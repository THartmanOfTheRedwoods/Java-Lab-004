public class RedesignDate {
    public static void newLine() {
        System.out.println();
    }

    public static void printAmerican(int day, int year) {
        System.out.print("Thursday, ");
        System.out.print("February ");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(year);
    }
    public static void printEuropean(int day, int year) {

        System.out.print(day);
        System.out.print(" February ");
        System.out.println(year);
    }

    public static void main(String[] args) {
        int day = 8;
        int year = 2024;
        System.out.print("Today's date in American format is, ");
        printAmerican(day, year);
        newLine();
        System.out.print("Today's date in European format is, ");
        printEuropean(day, year);


    }
}