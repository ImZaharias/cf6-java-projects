package gr.aueb.cf.ch6;

/**
 * Predicates are boolean methods.
 */
public class PredicatesApp {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int threshold = 2;

        // Check if there is at least one positive number in the array
        System.out.println("Has at least one positive: " + hasOnePositive(numbers));

        // Check if all numbers in the array are positive
        System.out.println("Are all positive: " + areAllPositive(numbers));

        // Check if the number of positive numbers in the array is less than or equal to a threshold
        System.out.println("Are less than or equal to threshold positive: " + areLTNPositive(numbers, threshold));

        // Check if the number of even numbers in the array is greater than or equal to a threshold
        System.out.println("Are greater than or equal to threshold even: " + areGTEven(numbers, threshold));

        // Check if the number of odd numbers in the array is greater than or equal to a threshold
        System.out.println("Are greater than or equal to threshold odd: " + areGTOdd(numbers, threshold));

        // Check if there are numbers with the same ending digit occurring more than or equal to a threshold
        System.out.println("Have same ending: " + areSameEnding(numbers, threshold));

        // Check if there are numbers in the same ten group occurring more than or equal to a threshold
        System.out.println("Have same group often: " + areSameGroupOften(numbers, threshold));
    }

    /**
     * Checks is there is at least one positive
     * in the input array.
     *
     * @param arr   the input array.
     * @return      true, if there is at least one positive,
     *              false otherwise.
     */
    public static boolean hasOnePositive(int[] arr) {
        boolean hasPositive = false;

        for (int item : arr) {
            if (item > 0) {
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }

    public static boolean areAllPositive(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }

    public static boolean areLTNPositive(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count <= threshold;
    }

    public static boolean areGTEven(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areGTOdd(int[] arr, int threshold) {
        int count = 0;


        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areSameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];
        boolean sameEnding = false;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item >= threshold) {
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    public static boolean areSameGroupOften(int[] arr, int threshold) {
        int[] tens = new int[10];
        boolean sameTen = false;

        for (int item : arr) {
            tens[item / 10]++;
        }

        for (int item : tens) {
            if (item >= threshold) {
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }
}

