
public class FindLargestElement {

    public static int findLargest(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 56};

        System.out.println("Array Elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nLargest Element: " + findLargest(arr));
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
