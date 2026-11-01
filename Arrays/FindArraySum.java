
public class FindArraySum {

    public static long calculateSum(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        long sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray Sum: " + calculateSum(arr));

        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
