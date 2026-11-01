
public class SecondLargestElement {

    public static int findSecondLargest(int[] arr) {

        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("At least two elements are required.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Second largest distinct element not found.");
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 56};

        System.out.println("Second Largest Element: " + findSecondLargest(arr));
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
