package Array;

import java.util.Arrays;

public class Second {
    public static void main(String[] args) {

        int[] array = {12, 35, 1, 10, 34, 1};
        int n = array.length;

        // If array has less than 2 elements
        if (n < 2) {
            System.out.println(-1);
            return;
        }

        // Sort array
        Arrays.sort(array);

        // Find second largest distinct element
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] != array[n - 1]) {
                System.out.println("The second largest element is: " + array[i]);
                return;
            }
        }

        // If no second largest element found
        System.out.println(-1);
    }
}
