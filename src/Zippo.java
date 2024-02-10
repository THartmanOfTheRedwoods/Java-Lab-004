public class Zippo {
    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }

    /*1*/ public static void main(String[] args) {
        /*2*/ zippo("rattle", 13);
    }
}
