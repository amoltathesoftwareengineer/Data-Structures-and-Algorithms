
public class BinarySearch {

    public static int search(int[] arr, int target) {

        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // Binary Search requires a sorted array.
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int result = search(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        System.out.println("Time Complexity: O(log n)");
        System.out.println("Space Complexity: O(1)");
    }
}
