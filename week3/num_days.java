package CSCI 1935.week3;
import java.util.Scanner;

public class num_days {
    public enum Day {
        January, Febuary, March, April, May, June, July, August, September, October, Noovember, December
    }
    public static void main(String[] args) {
        int num_days = 0;

        // getting month, day, year
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month");
        String month = scan.nextLine();
        System.out.println("Enter a date");
        int date = scan.nextInt();
        System.out.println("Enter a year");
        int year = scan.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            //
        }
        if (month == "January") {
            num_days = date;
        } else if (month == "Febuary"){
            num_days = 31 + date;
        } else{
            
        }
    }
}
