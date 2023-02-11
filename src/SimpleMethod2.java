import java.util.Scanner;

public class SimpleMethod2 {
    public static int math (int number){
  return (int) Math.pow (number,2.0);


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int result = math(input);
        System.out.println(result);








    }
}
