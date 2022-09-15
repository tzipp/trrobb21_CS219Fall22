package HW3;
/*
Tzipporah Robbins
HW3 Validating Input
September 15, 2022
 */

import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, int t, int n) {
        return c*Math.pow(1 + r/n, t*n);
    }// the investment function

    public static void main(String [] args) {

        System.out.println("HW3. Validating Input.");
        System.out.println("Return on an investment");
        System.out.println(); //Titles the assignment

        Scanner s =  new Scanner(System.in);
        // The user inputs the initial investment.
        // cannot be a negative number or a string.
        System.out.print("Initial Investment: ");
        double c;
        double inputC;
        if (s.hasNextDouble()){
            inputC = s.nextDouble();
            if (inputC > 1){
                c = inputC;
            }
            else {
                System.out.printf("Error: initial deposit should be greater than zero." +
                        " You entered \"%s\"", inputC);
                return;
            }
        }
        else {
            System.out.printf("Error: integer expected. You entered \"%s\"",
                                s.next());
            return;
        } // finding the c variable.

        // the user inputs the interest rate.
        // has to be an integer between 0 and 1.
        System.out.print("Interest Rate: ");
        double r;
        double inputR;
        if (s.hasNextDouble()){
            inputR = s.nextDouble();
            if (inputR > 0 && inputR < 1) {
                r = inputR;
            }
            else {
                System.out.printf("Error: interest rate should be expressed" +
                        "\nas a decimal between 0 and 1. You entered \"%s\".", inputR);
                return;
            }
        }
        else {
            System.out.printf("Error: decimal number expected. You entered \"%s\".",
                    s.next());
            return;
        }// finding the r variable.

        // The user inputs the number of years.
        // has to be an integer between 0 and 100.
        System.out.print("Number of years: ");
        int t;
        int inputT;
        if (s.hasNextInt()){
            inputT = s.nextInt();
            if (inputT > 0 && inputT < 100){
                t = inputT;
            }
            else {
                System.out.printf("Error: The number of years should be between " +
                        "0 and 100. You entered \"%s\".", inputT);
                return;
            }
        }
        else {
            System.out.printf("Error: Please enter the number of years" +
                            " as an integer. You entered \"%s\".",
                    s.next());
            return;
        }// finding the t variable.

        // the user inputs the number of times to compound per year.
        // has to be a positive integer.
        System.out.print("Number of times to compound per year: ");
        int n;
        int inputN;
        if (s.hasNextInt()){
            inputN = s.nextInt();
            if (inputN > 0){
                n = inputN;
            }
            else {
                System.out.printf("Error: The number of times to compound per " +
                        "year should be a positive number. You entered \"%s\"", inputN);
                return;
            }
        }
        else {
            System.out.printf("Error: Please enter the number of times" +
                            "to compound as an integer. You entered \"%s\".",
                    s.next());
            return;
        } // finding the n variable.

        System.out.printf("Your investment is worth %.2f", Investment.investment(c, r, t, n));
        // calls the investment function and then you're done! Yay! 🎉
    }
}
