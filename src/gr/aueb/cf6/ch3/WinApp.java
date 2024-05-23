package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  Μόνο δύο αριθμοί κερδίζουν
 *  οι 5 και ο 12. το 70 είναι ουδέτερο.
 */

public class WinApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean found = false;

        while (true) {
            System.out.println("Please give the lucky number");
            num = in.nextInt();

            if (num != 12 && num != 5 && num != 70) {
                System.out.println("No lucky number given");
                break;
            }

            if (num == 5) {
                System.out.println("Found: " + num);
                break;
            } else if (num == 12) {
                System.out.println("Found: " + num);
                break;
                // τα break ειναι 2 σημεία εξόσου καλυτερα να έχουμε 1 σημείο εξόδου
                //μπορουμε να τα βγαλουμε
                //χρειαζόμαστε μήνυμα ότι δεν βρέθηκε 5 , 12
                //                if (num == 5) {
                //                   found = true;
                //                }  else if (num == 12) {
                //                   found = true;
                //                }
                //
                //                System.out.println("No lucky number found");
            }
                //         if (found) System.out.println("found: " + num);
                //         else System.out.println("No lucky number found");
        }
    }
}