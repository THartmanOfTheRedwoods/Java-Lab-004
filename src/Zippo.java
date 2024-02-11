public class Zippo {
    public static void baffle(String blimp) { // 3
        System.out.println(blimp); // 8
        zippo("ping", -5); // 9
    }

    public static void zippo(String quince, int flag) { // 4
        if (flag < 0) { // 5
            System.out.println(quince + " zoop"); // 6
        } else {
            System.out.println("ik"); // 10
            baffle(quince); // 11
            System.out.println("boo-wa-ha-ha"); // 12
        }
    }

    public static void main(String[] args) { // 1
        zippo("rattle", 13); // 2
    }
}
