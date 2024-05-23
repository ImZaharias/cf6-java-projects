package gr.aueb.cf.ch5;

/**
 * Ελέγχει αν ένας ακέραιος είναι άρτιος η περιττός
 */

public class IsEvenApp {
    public static void main(String[] args) {
        int num = 11;
        boolean  isEven = false;

        isEven = isEven(11);

        System.out.printf("%d is even: %b\n", num, isEven);
        System.out.printf("%d is%seven", num, isEven ? " ": " not ");

    }

    /**
     * Επιστρέφει true αν ειναι άρτιος ή false αν είναι περιττός
     *
     * @param num
     * @return
     */

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
