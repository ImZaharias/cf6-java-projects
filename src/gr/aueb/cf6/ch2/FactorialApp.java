package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει το n! 1*2*3..n.
 * 0! - 1
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int facto = 1;
        int n = 0;
        int i = 1;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            facto = facto * i;
            i++;
        }
        System.out.printf("%d! = %d", n, facto);

    }
}
