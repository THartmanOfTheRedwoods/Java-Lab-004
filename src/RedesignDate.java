public class RedesignDate {
    static void printAmerican(String day, String month, int date, int year) {
        System.out.print("Today's date is: ");

    }
    static void printEuropean(String day, int date, String month, int year){
        System.out.print("In Europe it is written: ");
        System.out.printf("%s, %d, of %s, %d%n", day, date, month, year);

    }
  public  static void main(String[] arg) {

      String day = "Tuesday";
      int date = 6;
      String month = "February";
      int year = 2024;
     printAmerican(day, month, date, year);
     printEuropean(day, date, month, year);
  }

}
