package gr.aueb.cf.ch5;

/**
 *  Demonstrates ceil, floor, random
 */

public class MathApp {

    public static void main(String[] args) {
        double d = 3.45;

        System.out.printf("%.2f: ceil: %d, floor: %d\n", d, getCeil(d), getFloor(d));
        System.out.printf("Random value between 1-100: " + getRandom(1, 100));

    }

    /**
     *  Στρογγυλοποιεί προς τα επάνω.
     *
     * @param num
     * @return
     */

    public static int getCeil(double num) {
        return (int) Math.ceil(num);
    }

    /**
     * Περικόπτει
     *
     * @param num
     * @return
     */

    public static int getFloor(double num) {
        return (int) Math.floor(num);
    }

    /**
     *  Επιστρέφει τυχαίο αριθμό μεταξύ ελάχιστου και μέγιστου
     *
     * @param min
     * @param max
     * @return
     */

    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

}
