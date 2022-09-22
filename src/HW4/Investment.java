package HW4;
/*
Tzipporah Robbins
HW4 BETTER Validating Inputs
September 22, 2022
 */

import java.util.Scanner;

public class Investment {

    public static double getC(Scanner s) {
        boolean valid = false;
        double c = 0;

        while (!valid) {
            System.out.print("Initial investment: ");
            if (s.hasNextDouble()) {
                c = s.nextDouble();
                if (c < 0) {
                    System.out.printf("Error: Initial investment cannot be a negative number." +
                            "You entered \"%.2f\"\n", c);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered " +
                        "\"%s\"\n", s.next());
            }
        } // while
        return c;
    } // This function prompts the user for a C value until they put a double

    public static double getR(Scanner s) {
        boolean valid = false;
        double r = 0;

        while (!valid) {
            System.out.print("Interest rate: ");
            if (s.hasNextDouble()) {
                r = s.nextDouble();
                if (r < 0) {
                    System.out.printf("Error: Interest rate cannot be a negative number." +
                            "You entered \"%.2f\"\n", r);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered " +
                        "\"%s\"\n", s.next());
            }
        } // while
        return r;
    } // This function prompts the user for an R value until they put a double

    public static int getT(Scanner s) {
        boolean valid = false;
        int t = 0;

        while (!valid) {
            System.out.print("Number of years: ");
            if (s.hasNextInt()) {
                t = s.nextInt();
                if (t < 0) {
                    System.out.printf("Error: Number of years cannot be a negative number." +
                            "You entered \"%.2d\"\n", t);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter an integer. You entered " +
                        "\"%s\"\n", s.next());
            }
        } // while
        return t;
    } // This function prompts the user for a T value until they put an integer

    public static int getN(Scanner s) {
        boolean valid = false;
        int n = 0;

        while (!valid) {
            System.out.print("Number of times to compound: ");
            if (s.hasNextInt()) {
                n = s.nextInt();
                if (n < 0) {
                    System.out.printf("Error: Number times to compound cannot be a negative number." +
                            "You entered \"%.2d\"\n", n);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter an integer. You entered " +
                        "\"%s\"\n", s.next());
            }
        } // while
        return n;
    } // This function prompts the user for an N value until they put an integer


    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);
    }// the investment function

    public static void main(String[] args) {

        System.out.println("HW3. Validating Input.");
        System.out.println("Return on an investment");
        System.out.println(); //Titles the assignment

        Scanner s = new Scanner(System.in);

        double c = getC(s);
        double r = getR(s);
        int t = getT(s);
        int n = getN(s);

        System.out.printf("Your investment is worth %.2f ", investment(c, r, t, n));

    } // This is the main function that titles the assignment,
    // defines each variable, and calls each "get" function.
}

