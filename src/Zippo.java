public class Zippo { // 1
    public static void baffle(String blimp) { // 6
        System.out.println(blimp); // 7
        zippo("ping", -5); // 8
    }
    public static void zippo(String quince, int flag) { // 2
        if (flag < 0) { // 3
            System.out.println(quince + " zoop"); // 10
        } else { // 4
            System.out.println("ik"); // 5
            baffle(quince); // 11
            System.out.println("boo-wa-ha-ha"); // 13
        }
    }

    public static void main(String[] args) { // 15
        zippo("rattle", 13); // 16
    }
}

// The value of "blimp" when "baffle" is invoked is "rattle"

