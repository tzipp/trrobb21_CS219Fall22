package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double t,     // temperature
                                   double v) {  // velocity in MPH
        return 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
    }

    public static void main(String [] args){

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter temperature in degrees F: ");
        double temperature = kbd.nextDouble();

        System.out.print("Enter wind velocity in MPH: ");
        double velocity = kbd.nextDouble();

        System.out.printf("The Windchill for %.1f degrees at %.1f MPH is %.2f.\n"
                , temperature, velocity, windchill(temperature, velocity));

        System.out.println("They said \"Don't do it\".");
    }
}
