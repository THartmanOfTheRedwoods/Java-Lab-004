public class Zippo {//2
    public static void baffle(String blimp) {//3
        zippo("ping", -5);//4
    }//5
    public static void zippo(String quince, int flag) {//6
        if (flag < 0) {//7
            System.out.println(quince + " zoop");//8
        } else {//9
            System.out.println("ik");//10
            baffle(quince);//11
            System.out.println("boo-wa-ha-ha");//12
        }//13
    }//14

    public static void main(String[] args) {
        zippo("rattle", 13);
    } //1
}
