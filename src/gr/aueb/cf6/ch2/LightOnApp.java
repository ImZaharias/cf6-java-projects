package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα φώτα ενός αυτοκινήτου
 * με βάση τρεις μεταβλητές: αν βρέχει ΚΑΙ ταυτόχρονα ισχύει
 * ένα τουλαχιστον από τα επόμενα: είναι σκοτάδι ή τρέχουμε
 * (speed > 100). Τις τιμές αυτές τις λαμβάνουμε από τον χρήστη.
 */

public class LightOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean LightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if raining?");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert  the speed of the car");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);

        LightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on : " + LightsOn);
    }
}
