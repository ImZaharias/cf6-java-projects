package gr.aueb.cf.ch3;

/**
 *  Υπολογίζει το πλήθος ψηφίων ενός ακεραίου
 *  διαιρώντας επαναληπτικά με 10 μέχρι το αποτέλεσμα
 *  της διαίρεσης να γίνει 0.
 */

import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;

        System.out.println("Please insert a number (int)");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            count++;
            num = num / 10;
        } while (num != 0);

        System.out.printf("Num: %d consists of %d digits", inputNum, count);
    }
}
