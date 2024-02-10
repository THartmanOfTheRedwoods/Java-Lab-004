import java.util.Scanner;

public class RedesignDate {


    static void printAmerican(){
        String day = "Friday ";
        String month = "February ";
        String date = "9th ";
        String year = "2024 ";
        System.out.print(day);
        System.out.print(month);
        System.out.print(date);
        System.out.println(year);
        return;
    }
    static void printEuropean(){
        String day = "Friday ";
        String month = "February ";
        String date = "9th ";
        String year = "2024 ";
        System.out.print(day);
        System.out.print(date);
        System.out.print(month);
        System.out.println(year);
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1 for American format");
        System.out.println("Enter 2 for European format");
        System.out.print("Enter your choice: ");

        int choice = in.nextInt();

    if (choice == 1){
        printAmerican();
        }
        else{
        printEuropean();
        }



    }

    }