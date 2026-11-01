
public class MaximumSubarraySum {

    public static int maxSubArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum Subarray Sum: " + maxSubArray(arr));

        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
