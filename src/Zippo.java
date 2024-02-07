public class Zippo {
    public static void baffle(String blimp) { //value of the parameter `blimp` when `baffle` gets invoked is "Ping"
        System.out.println(blimp);
        zippo("ping", -5);
    }
    public static void zippo(String quince, int flag) {
      /*2*/ if (flag < 0) {
            System.out.println(quince + " zoop");
           /*3*/    } else {
           System.out.println("ik");
            /*4*/  baffle(quince);
        // System.out.println("boo!") + 7;
           System.out.println("boo-wa-ha-ha");

        }
    }

    public static void main(String[] args) {
        /*1*/  zippo("rattle", 13);
    }
}
