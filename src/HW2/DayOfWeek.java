/*
Tzipporah Robbins
07/09/2022
DayOfWeek Assignment
 */
package HW2;

import java.util.Scanner;

public class DayOfWeek {
    public static Integer dayofweek(int month, int day, int year){
        /*
        This is the dayofweek function/method.
        It does a bunch of math and then returns "dow"
        Which is the final integer (1-7)
         */
        int y0 =  year - (14 - month)/12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = month + 12 * ((14 - month) / 12) - 2;

        int dow = (day + x + (31*m0) / 12) % 7;
        return (dow);
    }
    public static void main(String [] args) {
        // This is the main function/method that prompts the user
        // and calls the dayofweek function.
        Scanner mdy = new Scanner(System.in);
        System.out.print("Please enter the month as an integer: ");
        int month = mdy.nextInt();
        System.out.print("Please enter the day as an integer: ");
        int day = mdy.nextInt();
        System.out.print("Please enter the year as an integer: ");
        int year = mdy.nextInt();
        System.out.println(dayofweek(month, day, year));
    }

}
