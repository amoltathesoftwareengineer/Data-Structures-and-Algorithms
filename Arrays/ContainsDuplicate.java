
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2};

        System.out.println("Contains Duplicate: "
                + containsDuplicate(arr));

        System.out.println("Time Complexity: O(n) average");
        System.out.println("Space Complexity: O(n)");
    }
}
