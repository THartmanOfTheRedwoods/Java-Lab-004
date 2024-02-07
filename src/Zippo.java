public class Zippo {
    public static void baffle(String blimp) { //2
        System.out.println(blimp);
        zippo("ping", -5);
    }
    public static void zippo(String quince, int flag) { //3
        if (flag < 0) {
            System.out.println(quince + " zoop");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }

    public static void main(String[] args) {zippo("rattle", 13);} //1
}
