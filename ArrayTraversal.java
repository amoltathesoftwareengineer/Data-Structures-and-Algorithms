
import java.util.Scanner;

public class ArrayTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray Elements:");

        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + " : " + arr[i]);
        }

        sc.close();
    }
}
