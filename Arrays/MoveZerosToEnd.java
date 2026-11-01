
import java.util.Arrays;

public class MoveZerosToEnd {

    public static void moveZeros(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        moveZeros(arr);

        System.out.println("After Moving Zeros: " + Arrays.toString(arr));

        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
