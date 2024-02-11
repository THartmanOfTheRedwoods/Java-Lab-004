public class RedesignDate {
    public static void printAmerican(String day, int date, String month, int year){
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    public static void printEuropean(String day, int date, String month, int year){
        System.out.println(month + ", " + day + " " + date + ", " + year);
    }
    public static void main(String[] args){
        printAmerican("Saturday", 10, "February", 2024);
        printEuropean("Saturday", 10, "February", 2024);
        System.out.println("I assumed US and European formats only applied to MM/DD/YYYY and DD/MM/YYYY so not entirely " +
                "sure if this is good");
    }
}

