
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();

        if (arr == null || arr.length < 3) {
            return result;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                long sum = (long) arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                    result.add(Arrays.asList(
                            arr[i], arr[left], arr[right]
                    ));

                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }

                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.println("Three Sum Results: " + threeSum(arr));

        System.out.println("Time Complexity: O(n²)");
        System.out.println("Space Complexity: O(n) including output");
    }
}
