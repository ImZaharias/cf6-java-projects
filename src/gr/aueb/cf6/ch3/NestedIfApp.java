package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  Δέχεται ως είσοδο 1) σύνολο βαθμολογίας και 2) πλήθος μαθημάτων
 *  και υπολογίζει τον μέσο όρο. Στην συνέχεια δίνει feedback
 *  στον χρήστη : 9-10 άριστα, 7-8 καλώς, 5-6 λίαν καλώς, κάτω
 *  από 5 αποτυχία.
 */

public class NestedIfApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int moduleCount = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Please insert the sum of grades");
        totalMarks = in.nextInt();

        System.out.println("Please insert modules count");
        moduleCount = in.nextInt();

        if (moduleCount == 0) {
            System.out.println("Modules count can not be zero");
            System.exit(1);
        }

        average = totalMarks / moduleCount;
        if (average < 0 || average > 10) {
            System.out.println("Error in input data");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent: " + average);
        } else if (average >= 7) {
            System.out.println("Very good: " + average);
        } else if (average >= 5) {
            System.out.println("Good: " + average);
        }else {
            System.out.println("Fail: " + average);
        }
    }
}
