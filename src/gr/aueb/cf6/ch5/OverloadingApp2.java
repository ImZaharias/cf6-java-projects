package gr.aueb.cf.ch5;

/**
 * Demonstrates overloading (υπερφόρτωση)
 *     *ίδιο όνομα μεθόδου, διφορετικές τυπικές παράμετροι
 *
 *     Method Signature = όνομα της μεθόδου και οι τυπικές παράμετροι
 */

public class OverloadingApp2 {

    public static void main(String[] args) {
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        sum2 = add(1, 2);
        sum3 = add(1, 2, 3);
        sum4 = add(1, 2, 3, 4);
    }

    /**
     * adds two integers
     *
     * @param a   first int
     * @param b   second int
     * @return    sum
     */

    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * adds three integers
     *
     * @param a   first int
     * @param b   second int
     * @return    sum
     */

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * adds four integers
     *
     * @param a   first int
     * @param b   second int
     * @return    sum
     */

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
