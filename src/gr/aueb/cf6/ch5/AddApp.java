package gr.aueb.cf.ch5;

/**
 * προσθέτει 2 ακεραίους με την χρήση μεθόδου.
 */

public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = add(a, b);  // result = AddApp.add(a, b)

        System.out.printf("%d + %d = %d", a, b, result);

    }

    /**
     * Adds two integers.
     *
     * @param a     the first integer.
     * @param b     the second integer.
     * @return      the sum of the two integers.
     */

    public static int add(int a, int b) {

        //int result = 0;

        //return = a + b;

        //return result;

        return a + b;
    }
}
