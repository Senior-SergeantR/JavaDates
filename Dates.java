package javaDates;

import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the former year: ");
        int previousYear = sc.nextInt();

        System.out.println("Enter the current year: ");
        int currentYear = sc.nextInt();

        if (currentYear > previousYear ){
            System.out.println("The years list as follows with dates");
            int i;
            for (i = previousYear; i<=currentYear; i++){
                System.out.println("The year: "+i+" Number of days: "+number_of_days(i));
            }

        }else {
            System.out.println("Can you be serious with your life!!!");
        }
    }

    public static int number_of_days(int Year){
        if (leapYear(Year)){
            return 366;
        }else{
            return 355;
        }
    }

    public static boolean leapYear(int year){
        return year%4==0 ;

    }
}
