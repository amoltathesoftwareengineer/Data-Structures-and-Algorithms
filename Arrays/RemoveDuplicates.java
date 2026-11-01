
import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);

        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 5, 3, 4, 1, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int newLength = removeDuplicates(arr);

        System.out.println("Array After Removing Duplicates:");

        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTime Complexity: O(n log n)");
        System.out.println("Space Complexity: O(1) auxiliary space");
    }
}
