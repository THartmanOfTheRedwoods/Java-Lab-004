public class RedesignDate {
    public static void printAmerican(int day, String date, String month, int year){
System.out.print(date);
System.out.print(", ");
System.out.print(month);
System.out.print(day);
System.out.print(", ");
System.out.println(year);
}
public static void printEuropean(int day, String date, String month, int year) {
    System.out.print(date);
    System.out.print(", ");
    System.out.print(day);
    System.out.print(" " + month);
    System.out.println(year);
}
public static void main(String[] args){
int day=10;
int year=2024;
String date= "Saturday";
String month="February ";
printAmerican(day,date, month, year);
printEuropean(day, date, month ,year);
}
}