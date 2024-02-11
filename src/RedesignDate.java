/**
     * @author Trevor Hartman
     * @author Alexei Iachkov
     * @verison 1.0
     * @date 2-10-24
     */

    public class RedesignDate {
        public static void printAmerican(String day, int date, String month, int year) {
            System.out.println(day + ", " + month + " " + date + ", " + year);
        }
        public static void printEuropean(String day, int date, int month, int year) {
            System.out.println(day + ", " + date + "/" + month + "/" + year);
        }
        public static void main(String[] args) {
            printAmerican("Saturday", 10, "February", 2024);
            printEuropean("Saturday", 10, 2, 2024);

        }

    }
