public class Zippo {
    public static void baffle(String blimp) {
        System.out.println(blimp); // #3
        zippo("ping", -5); //#4
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop"); //#5
        } else {
            System.out.println("ik");  //#1
            baffle(quince);  //#2
            System.out.println("boo-wa-ha-ha"); //#6
        }
    }

    public static void main(String[] args) {
        zippo("rattle", 13);
    }
}
