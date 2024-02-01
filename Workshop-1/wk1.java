package WK1;

// Scanner
import java.util.Scanner;
import java.util.List;

public class wk1 {

    // Method to get the absolute value of a number
    public static double getAbsolute(int x) {
        return (x < 0) ? -x : x;
    }

    // Nested Class for Date
    public static class Date {
        // attributes
        private final int Month;
        private final int Day;
        private final int Year;

        // Constructor
        public Date(int month, int day, int year) {
            Month = month;
            Day = day;
            Year = year;
        }

        // Method to print the date
        public int Month() {
            return Month;
        }

        // Method to print the date
        public int Day() {
            return Day;
        }

        // Method to print the date
        public int Year() {
            return Year;
        }

    }

    //Nested Class 
    public static <T extends Comparable<T>> T findSmallestElement(List<T> list){
        T smallest  =  list.get(0);
        for (T element : list){
            if (element.compareTo(smallest) < 0){
                smallest = element;
            }
        }
        return smallest;
    }
  
    // Main Method
    public static void main(String[] args) {
        // Test the getAbsolute method
        // int x = -5;
        // System.out.println("The absolute value of " + x + " is " + getAbsolute(x));
        // double result = 2.0 * Math.exp(-6) * 100000000.1;
        // System.out.printf("2.0 * e^-6 * 100000000.1 = %f%n", result);

        // Test the Date Class
        // create an object of the Date class
        // Date date = new wk1().new Date(1, 31, 2024);
        // print the date
        // System.out.println("The date is " + date.Month() + "/" + date.Day() + "/" +
        // date.Year());

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        // read args from the command line
        if (args.length == 3) {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            num3 = Integer.parseInt(args[2]);
            if (areEqual(num1, num2, num3)) {
                System.out.println("The numbers are equal");
            } else {
                System.out.println("The numbers are not equal");
            }

        } else {
            System.out.println("Please enter 3 numbers as command line arguments");
            // Scanner object
            // Scanner input = new Scanner(System.in);
            // // get the first number
            // System.out.println("Enter the first number: ");
            // num1 = input.nextInt();
            // // get the second number
            // System.out.println("Enter the second number: ");
            // num2 = input.nextInt();
            // // get the third number
            // System.out.println("Enter the third number: ");
            // num3 = input.nextInt();
        }
        return;
    }

    // Method to check if 3 numbers are equal
     static boolean areEqual(int num1, int num2, int num3) {
        return (num1 == num2 && num2 == num3);
    }

}
