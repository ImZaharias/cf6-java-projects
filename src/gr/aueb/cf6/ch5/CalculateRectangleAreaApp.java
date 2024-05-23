package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το εμβαδόν ενός παραλληλογράμου
 */

public class CalculateRectangleAreaApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0D;
        double height = 0D;
        double area = 0D;

        System.out.println("Please insert two doubles");
        width = in.nextDouble();
        height = in.nextDouble();

        area = calculateArea(width, height);

        System.out.println("Area: "+ area);
    }

    /**
     *  Υπολογίζει το εμβαδόν ενός παραλληλογράμμου
     *
     * @param width     πλάτος
     * @param height    ύψος
     * @return          επιστρέφη το εμβαδόν
     */

    public static double calculateArea (double width, double height) {
        return width * height;
    }
}
