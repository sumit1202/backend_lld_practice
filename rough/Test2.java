package rough;

public class Test2 {

    /**
     * Calculates the factorial of the given number n.
     * 
     * The factorial of a number is the product of all positive integers
     * less than or equal to n. For example, the factorial of 5 is
     * 1 * 2 * 3 * 4 * 5 = 120.
     * 
     * This implements an iterative approach using a for loop.
     */
    static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * Performs insertion sort on the given integer array.
     * 
     * Iterates over the array starting from the second element. Compares the
     * current
     * element with the previous ones and swaps them if required to maintain the
     * sorted order.
     * 
     * This results in the array being sorted in ascending order after the method
     * completes.
     */
    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }
    }

    /**
     * Demonstrates sorting an array and computing a factorial.
     */
    public static void main(String[] args) {
        int[] arr3 = { 5, 5, 4, 3, 1 };
        insertionSort(arr3);
        for (int num : arr3) {
            System.out.println(num);
        }

        System.out.println();

        System.out.println(factorial(4));
    }

}
