public class Zoop {
    public static void zoop() {
        baffle(); //3
        System.out.print("You wugga "); //7
        baffle(); //8
    }
    public static void baffle() {
        System.out.print("wug"); //4 //9
        ping(); //5 //10
    }
    public static void ping() {
        System.out.println("."); //6 //11
    }
    public static void main(String[] args) {
        System.out.print("No, I "); //1
        zoop(); //2
        System.out.print("I "); //12
        baffle(); //13
    }
}