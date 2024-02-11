public class Zippo {
    public static void baffle(String blimp) {//7
        System.out.println(blimp);//8
        zippo("ping", -5);//9
    }
    public static void zippo(String quince, int flag) {//2
        if (flag < 0) { //3 //10
            System.out.println(quince + " zoop");//11
        } else { //4
            System.out.println("ik");//5
            baffle(quince);//6
            System.out.println("boo-wa-ha-ha");//12
        }
    }

    public static void main(String[] args) {
        zippo("rattle", 13);
    } //1
}
