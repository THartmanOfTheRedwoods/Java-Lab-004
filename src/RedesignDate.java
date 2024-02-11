public class RedesignDate {
    public static void printAmerican(String day, String month, int date, int year){

        System.out.println(day + month + date + " ," + year);
    }
    public static void printEuropean(String day, int date, String month, int year){
        System.out.println(day +" "+ date +" "+ month + ", " + year);

    }
    public static void main (String[] args) {
        System.out.print("American: ");
        printAmerican("Saturday, ", "February ", 10 , 2024);
        System.out.print("European: ");
        printEuropean("Saturday", 10, "February", 2024);
    }


}
