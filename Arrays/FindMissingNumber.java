
public class FindMissingNumber {

    public static int findMissing(int[] arr, int n) {

        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {

        int n = 6;
        int[] arr = {1, 2, 4, 5, 6};

        System.out.println("Array Elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nMissing Number: " + findMissing(arr, n));

        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
