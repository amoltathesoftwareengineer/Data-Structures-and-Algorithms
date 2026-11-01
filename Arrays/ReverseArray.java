
import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));

        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
