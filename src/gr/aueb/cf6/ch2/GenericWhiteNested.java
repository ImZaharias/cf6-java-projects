package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *  Ο χρήστης δίνει αρχική τιμή, τελικη και step
 *  και το προγραμμα υπολογίζει πάσες φορέσ εκτελείται
 *  μια while.
 */

public class GenericWhiteNested {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;
        int times = 1;

        while (times <= 3) {
            System.out.println("Please insert, beginValue, EndValue and Step");
            start = in.nextInt();
            endValue = in.nextInt();
            step = in.nextInt();

            while (start <= endValue) {
                counter += 1;
                start += step;
            }

            System.out.println("Iterations count: " + counter);
            times++;
        }
    }
}
