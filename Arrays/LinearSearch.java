
public class LinearSearch {

    public static int search(int[] arr, int target) {

        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 50, 65};
        int target = 45;

        int result = search(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
