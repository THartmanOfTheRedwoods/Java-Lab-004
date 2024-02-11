public class Zippo {
    public static void baffle(String blimp) { //1
        System.out.println(blimp); //2
        zippo("ping", -5); //3
    } //4
    public static void zippo(String quince, int flag) { //5
        if (flag < 0) { //6
            System.out.println(quince + " zoop"); //7
        } else { //8
            System.out.println("ik"); //9
            baffle(quince); //10
            System.out.println("boo-wa-ha-ha"); //11
        } //12
    }//13

    public static void main(String[] args) {
        zippo("rattle", 13);

    } //14
} //15
