import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int x){
        int squareResult = (x*x);
        return squareResult;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner userInput = new Scanner(System.in);
        System.out.println("What number do you want squared?");
        int input = userInput.nextInt();

        // Modify the below call to assign the result of the method call to a variable.
        int finalSquareResult = square(input);
        // Put the result System.out code here.
        System.out.println(finalSquareResult);
    }
}
