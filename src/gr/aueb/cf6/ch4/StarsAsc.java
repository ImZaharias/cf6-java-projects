package gr.aueb.cf.ch4;

/**
 *  Αστεράκια με αύξουσα σειρά.
 */

public class StarsAsc {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}