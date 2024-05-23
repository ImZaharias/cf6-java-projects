package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει true/false από το studio για τις δυο
 * δεξαμενές αν είναι < 1/4. Επεξεργάζεται και ανάβει
 * πορτοκαλί αν η μία είναι 1/4 και κόκκινο αν και
 * οι δύο είναι < 1/4.
 */

public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isLTQuarterTank1 = false;
        boolean isLTQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if tank 1 is LT quarter");
        isLTQuarterTank1 = in.nextBoolean();

        System.out.println("Please insert if tank 2 is LT quarter");
        isLTQuarterTank2 = in.nextBoolean();

        isRed = isLTQuarterTank1 && isLTQuarterTank2;

        isOrange = isLTQuarterTank1 ^ isLTQuarterTank2;

        System.out.println("Orange = " + isOrange + ", " + "Red: " + isRed);
    }
}
