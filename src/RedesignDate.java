public class RedesignDate {
 public static void main(String[] args) {
 String day = "Thursday";
    String month = "July";
    int date = 18;
            int year = 2019;
 printAmerican(day, date, month, year);
     printEuropean(day, date, month, year);
}
    public static void printAmerican(String day, int date, String month, int year ) {
        System.out.printf("%s,%s %d,%d%n", day, month, date, year);
    }
        public static void printEuropean(String day, int date, String month, int year ) {
            System.out.printf("%s,%d %s,%d%n", day, date, month, year);
        }
}
