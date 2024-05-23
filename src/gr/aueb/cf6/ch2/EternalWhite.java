package gr.aueb.cf.ch2;

/**
 * infinite while loop.
 */

public class EternalWhite {

    public static void main(String[] args) {
        int i = 1;

        while (i < 0) {
            System.out.println("NEVER gets in");
            i++;
        }

        while (i <= 1) {
            System.out.println("Only ONE iteration");
            i++;
        }

        while (true) {
            System.out.println("I am ETERNAL");
        }
    }
}
