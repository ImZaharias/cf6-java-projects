package gr.aueb.cf.ch2;

/**
 *
 *  This program calculates the factorial of a given number
 *  n using a simple iterative approach.
 */

import java.util.Scanner;

public class mul {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 1;
        int i = 1;
        int n = 0;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            sum = sum * i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
