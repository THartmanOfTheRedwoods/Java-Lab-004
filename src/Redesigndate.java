public class Redesigndate {
    public static void main(String[] args) {
        printAmerican("February", "Friday", 9, 2024);

        printEuropean("Friday", 9, "February", 2024);
    }
        public static void printAmerican(String month, String day, int date, int year) {
            System.out.println(day + ", " + month + " " + date + ", " + year);
        }
        public static void printEuropean(String day, int date, String month, int year) {
            System.out.println(month + " " + date + ", " + day + ", " + year);
        }
}
