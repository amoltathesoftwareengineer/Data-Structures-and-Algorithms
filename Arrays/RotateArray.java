
import java.util.Arrays;

public class RotateArray {

    public static void rotateRight(int[] arr, int k) {

        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        int n = arr.length;

        if (n == 0) {
            return;
        }

        k = k % n;

        if (k < 0) {
            k += n;
        }

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateRight(arr, k);

        System.out.println("Rotated Array: " + Arrays.toString(arr));

        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
