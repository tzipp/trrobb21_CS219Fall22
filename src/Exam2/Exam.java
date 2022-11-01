package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exam {

    /* I'm sorry I tried so many different things and nothing worked
    So i had to give up.
     */
    public static String [] load_words(String path, int n) {
        // connect to the web page of speeds
        URL url = null; // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
        }
        return words;
    }

    // I couldn't figure out how to modify load_words,
    // so I am making a separate function to do that.
    // I wasn't in class for this, so it doesn't really make sense to me
    // This is me trying to go through each element of the array
   /* public static String [] reverse(String [] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < temp.length() / 2; j++);
            if (temp.charAt(j) == temp.charAt(temp.length() - 1))
                return temp;

            else return;

        }
        return -1;
    }

    */

    public static void main(String [] args){
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);


    }
}
