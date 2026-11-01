
import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        int n = arr.length;
        int[] result = new int[n];

        int prefix = 1;

        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }

        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] result = productExceptSelf(arr);

        System.out.println("Product Except Self: " + Arrays.toString(result));

        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1) auxiliary space (excluding output)");
    }
}
