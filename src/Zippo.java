public class Zippo {
    public static void baffle(String blimp) {
        System.out.println(blimp);  //5
        zippo("ping", -5);  //6
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {  //2 //7
            System.out.println(quince + " zoop");  //8
        } else {
            System.out.println("ik");  //3
            baffle(quince);  //4
            System.out.println("boo-wa-ha-ha");  //9
        }
    }

    public static void main(String[] args) {
        zippo("rattle", 13);
    }  //1
}
