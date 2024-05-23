package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού με πολλαπλά if-the-else.
 */

public class MenuIfFeedbackApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω ή 5 για έξοδο:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Αναζήτηση");
            System.out.println("4. Διαγραφή");
            System.out.println("4. Ενημέρωση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();
            if (choice == 1) {
                System.out.println("Επιτυχείς Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιτυχείς Αναζήτηση");
            } else if (choice == 3) {
                System.out.println("Επιτυχείς Διαγραφή");
            } else if (choice == 4) {
                System.out.println("Επιτυχείς Ενημέρωση");
            } else if (choice == 5) {
                System.out.println("Επιλέξατε Έξοδος");
            } else {
                System.out.println("Λάθος Επιλογή");
            }
        } while (choice != 5);

        System.out.println("Goodbye");
    }
}
