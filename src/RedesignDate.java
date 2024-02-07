public class RedesignDate {

    public static String printAmerican(String day, int date, String month, int year) {
        String Americanformat = "%s, %s %dth, %d";
        return String.format(Americanformat, day, month, date, year);

        }
    public static String printEuropean(String day, int date, int month, int year) {
        String Europeanformat = "%s, %d %dth, %d";
        return String.format(Europeanformat, day, month, date, year);

    }

    public static void main(String[] args) {
        if(args.length>0) {
            System.out.println(RedesignDate.printAmerican("Wednesday", 7, "Feburary", 2024));
        }else {
            System.out.println(RedesignDate.printEuropean("Wednesday", 7, 2, 2024));
        }

    }

}
