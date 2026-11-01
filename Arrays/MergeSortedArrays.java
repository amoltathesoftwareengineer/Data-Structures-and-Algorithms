
import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] merge(int[] arr1, int[] arr2) {

        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Arrays cannot be null.");
        }

        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] result = merge(arr1, arr2);

        System.out.println("First Array: " + Arrays.toString(arr1));
        System.out.println("Second Array: " + Arrays.toString(arr2));
        System.out.println("Merged Array: " + Arrays.toString(result));

        System.out.println("Time Complexity: O(n + m)");
        System.out.println("Space Complexity: O(n + m)");
    }
}
