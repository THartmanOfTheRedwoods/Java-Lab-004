public class RedesignDate {
    public static void main(String[] args) {

        //Call the American method
        printAmerican(25, 2024);
        //Call the European method
        printEuropean(25, 2024, 1);

    }
//Declare the american method
public static void printAmerican(int date, int year){


        String day = "Thursday";
        date = 25;
        String month = "January";
        year = 2024;


        System.out.println("American:" + day + ", " + month + " " + date + ", " + year);
    }
        public static void printEuropean(int date, int year, int monthEU) {

            String day = "Thursday";
            date = 25;
            String month = "January";

            monthEU = 1;
            year = 2024;


            System.out.println("European:" + year + "-" + monthEU + "-" + date);


        }

}