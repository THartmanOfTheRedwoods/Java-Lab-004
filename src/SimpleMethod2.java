import java.util.Scanner;

public class SimpleMethod2 {

    public static void square(int a) {
        System.out.print(Math.sqrt(a));
    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("What would you like to square?");
        int x = Scanner.nextInt();
        square(x);
    }
}
