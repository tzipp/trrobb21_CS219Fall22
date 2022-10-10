package Exam1;

import java.util.Scanner;

public class Exam1 {
    // Tzipporah Robbins
    //Exam 1 Make-up
    // October 10, 2022

    public static int validateN(Scanner s){
        boolean valid = false;
        int n = 0;

        while (!valid){
            System.out.print("Enter an integer: ");
            if (s.hasNextInt()){
                n = s.nextInt();
                if (n < 0){
                    System.out.printf("Error: Integer should not be a " +
                            "negative number. You entered: \"%d\".\n", n);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter an integer. You entered " +
                        "\"%s\".\n", s.next());
            }
        }
        return n;
    } // validation

    public static int betweenTwoAndSeven(int n) {

        int eachInt = 0;
        int count = 0;
        while (n > 0){
            eachInt = eachInt + (n % 10);
            if (eachInt < 7 && eachInt > 2){
                count++;
            }
            eachInt = 0;
            n = n / 10;
        }
        return count;
    } // between two and seven
    public static void main(String [] args){
        System.out.println("Exam 1");
        Scanner s = new Scanner(System.in);
        int n = validateN(s);
        System.out.printf("The number of digits between" +
                " two and seven in your number is %d.",betweenTwoAndSeven(n));
    } // main

}