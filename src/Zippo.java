public class Zippo {
  3  public static void baffle(String blimp) {
   4     System.out.println(blimp);
   5     zippo("ping", -5);
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {
   6         System.out.println(quince + " zoop");
        } else {
   2         System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }

   1 public static void main(String[] args) {
        zippo("rattle", 13);
    }
}
