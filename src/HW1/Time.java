package HW1;

public class Time {
    public static void main(String [] args) {
        // the variables that represent the time.
        int hour = 20;
        int minute = 58;
        int second = 30;
        //two double variables that do calculations
        double since_midnight = (hour * 3600) + (minute * 60) + second;
        double percentage_elapsed = Math.round((since_midnight / 86400) * 100);
        // repetitive printing that includes strings and integers
        System.out.println("Homework 1"); // naming the assignment
        System.out.print("20:58:30 is ");
        System.out.print(since_midnight);
        System.out.println(" seconds since midnight.");
        System.out.print("There are ");
        System.out.print(86400 - since_midnight);
        System.out.println(" seconds remaining.");
        System.out.print(percentage_elapsed);
        System.out.print("% of the day has elapsed.");
    }
}
