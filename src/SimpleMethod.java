/**
 *
 * @author Trevor Hartman
 * @author Katie Logefeil
 *
 * @!since Version 1.0
 *
 */


public class SimpleMethod {
    // Put your method code here
    public static void square(int number){
        int result = number * number;
        System.out.println("The result of squaring " + number + " is " + result);
    }


    public static void main(String[] args) {
        // This is the method call, create the square method.
        square(25);
    }
}
