public class Zippo {
    public static void baffle(String blimp) { //6
        System.out.println(blimp); //7
        zippo("ping", -5); //8
    }
    public static void zippo(String quince, int flag) { //2
        if (flag < 0) { //9
            System.out.println(quince + " zoop"); //10
        } else { //3
            System.out.println("ik"); //4
            baffle(quince); //5
            System.out.println("boo-wa-ha-ha"); //11
        }
    }

    public static void main(String[] args) { zippo("rattle", 13); //1
    }
}
