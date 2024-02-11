public class Zippo {
      public static void baffle(String blimp) {//
        System.out.println(blimp);
        zippo("ping", -5);
    }
     public static void zippo(String quince, int flag) { //3
        if (flag < 0) { //4
            System.out.println(quince + " zoop");
        } else { //5
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }

     public static void main(String[] args) { //1
        zippo("rattle", 13); //2
    }
}
