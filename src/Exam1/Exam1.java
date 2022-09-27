package Exam1;

import java.util.Scanner;

public class Exam1 {

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
    }
    
    public static int betweenTwoAndSeven(int n){
        int count = 0;
        for (int i = 0; i < n.length; i++){
            if (i > 2 && i < 7){
                count++;
            }
            }
        return count;
        }

        //I only know how to index a number because it is usually
    // an input straight from the user.
    // Here, I didn't know what to do because the value is an integer after
    // it gets validated.
    // I can't use the length method, so I think I'm going to give up.
    // Hope I can get partial credit.
    

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        int n = validateN(s);
        System.out.println(betweenTwoAndSeven(n));
    }

}
