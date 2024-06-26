package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  Υπολογίζει τον μικρότερο 2 ακεραίων με τη χρήση
 *  τριαδικού τελεστή.
 */

public class TernaryOpApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        min = (num1 < num2) ? num1 : num2;  // then = ?,  else = :

        System.out.printf("The min value between %d and %d is: %d\n", num1, num2, min);
    }
}
