import java.util.Scanner;
public class RedesignDate {
    static void printAmerican() {
        String day = "Thursday, ";
        String month = "February ";
        String date = "8 ";
        String year = "2024 ";
        System.out.println(day + month + date + year);
    }
        static void printEuropean() {
            String day = "Thursday ";
            String month = "February ";
            String date = "8 ";
            String year = "2024 ";
            System.out.println(day + date + month + year);
    }

    public static void main(String[] args) {

        System.out.println("Enter 1 for American date format or 2 for European format");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice == 1) {
            printAmerican();
        } else {
            printEuropean();
        }
    }}