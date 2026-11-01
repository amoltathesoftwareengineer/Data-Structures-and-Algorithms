
import java.util.*;

public class Main {

    // ================= ARRAYS =================

    static int largest(int[] a) {
        return Arrays.stream(a).max().orElseThrow();
    }

    static int secondLargest(int[] a) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : a) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n < first) {
                second = n;
            }
        }
        return second;
    }

    static void reverseArray(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int t = a[i]; a[i] = a[j]; a[j] = t;
        }
    }

    static int linearSearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target) return i;
        return -1;
    }

    static int binarySearch(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == target) return m;
            if (a[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    static int maxSubarraySum(int[] a) {
        int current = a[0], best = a[0];
        for (int i = 1; i < a.length; i++) {
            current = Math.max(a[i], current + a[i]);
            best = Math.max(best, current);
        }
        return best;
    }

    static int[] twoSum(int[] a, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int c = target - a[i];
            if (map.containsKey(c)) return new int[]{map.get(c), i};
            map.put(a[i], i);
        }
        return new int[]{-1, -1};
    }

    // ================= STRINGS =================

    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(reverseString(clean));
    }

    static boolean isAnagram(String a, String b) {
        char[] x = a.toLowerCase().toCharArray();
        char[] y = b.toLowerCase().toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) >= 0) count++;
        return count;
    }

    static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray())
            if (seen.add(c)) result.append(c);
        return result.toString();
    }

    // ================= LINKED LIST =================

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node reverseList(Node head) {
        Node prev = null, current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // ================= STACK =================

    static class StackDS {
        Stack<Integer> stack = new Stack<>();
        void push(int x) { stack.push(x); }
        int pop() { return stack.pop(); }
        int peek() { return stack.peek(); }
        boolean isEmpty() { return stack.isEmpty(); }
    }

    // ================= QUEUE =================

    static class QueueDS {
        Queue<Integer> queue = new LinkedList<>();
        void enqueue(int x) { queue.offer(x); }
        int dequeue() { return queue.remove(); }
        int peek() { return queue.element(); }
        boolean isEmpty() { return queue.isEmpty(); }
    }

    // ================= SORTING =================

    static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                }
    }

    static void mergeSort(int[] a) {
        if (a.length <= 1) return;
        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);
        mergeSort(left);
        mergeSort(right);
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length)
            a[k++] = left[i] <= right[j] ? left[i++] : right[j++];
        while (i < left.length) a[k++] = left[i++];
        while (j < right.length) a[k++] = right[j++];
    }

    // ================= RECURSION =================

    static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // ================= TREES =================

    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int data) { this.data = data; }
    }

    static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static int treeHeight(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(treeHeight(root.left), treeHeight(root.right));
    }

    // ================= GRAPHS =================

    static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited.add(start);
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int next : graph.getOrDefault(node, Collections.emptyList()))
                if (visited.add(next)) q.offer(next);
        }
        System.out.println();
    }

    static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        if (!visited.add(node)) return;
        System.out.print(node + " ");
        for (int next : graph.getOrDefault(node, Collections.emptyList()))
            dfs(graph, next, visited);
    }

    // ================= HASHING =================

    static Map<Integer, Integer> frequency(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : a) map.put(n, map.getOrDefault(n, 0) + 1);
        return map;
    }

    static boolean containsDuplicate(int[] a) {
        return Arrays.stream(a).distinct().count() != a.length;
    }

    // ================= DYNAMIC PROGRAMMING =================

    static int climbStairs(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        if (n <= 1) return 1;
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins)
            for (int i = coin; i <= amount; i++)
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        return dp[amount] > amount ? -1 : dp[amount];
    }

    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 9, 3};

        System.out.println("Largest: " + largest(numbers));
        System.out.println("Second Largest: " + secondLargest(numbers));
        System.out.println("Linear Search: " + linearSearch(numbers, 8));
        System.out.println("Binary Search: " +
                binarySearch(new int[]{1, 2, 3, 5, 8, 9}, 5));
        System.out.println("Maximum Subarray Sum: " +
                maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

        System.out.println("Two Sum: " +
                Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

        System.out.println("Reverse String: " + reverseString("Java"));
        System.out.println("Palindrome: " + isPalindrome("Madam"));
        System.out.println("Anagram: " + isAnagram("listen", "silent"));
        System.out.println("Vowels: " + countVowels("Programming"));

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printList(reverseList(head));

        StackDS st = new StackDS();
        st.push(10);
        st.push(20);
        System.out.println("Stack Pop: " + st.pop());

        QueueDS q = new QueueDS();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println("Queue Dequeue: " + q.dequeue());

        int[] sort = {5, 2, 8, 1, 3};
        mergeSort(sort);
        System.out.println("Merge Sort: " + Arrays.toString(sort));

        System.out.println("Factorial: " + factorial(5));
        System.out.println("Fibonacci: " + fibonacci(7));

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println("\nTree Height: " + treeHeight(root));

        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList(5));
        System.out.print("BFS: ");
        bfs(graph, 1);
        System.out.print("DFS: ");
        dfs(graph, 1, new HashSet<>());
        System.out.println();

        System.out.println("Frequency: " +
                frequency(new int[]{1, 2, 2, 3, 3, 3}));
        System.out.println("Contains Duplicate: " +
                containsDuplicate(new int[]{1, 2, 3, 2}));

        System.out.println("Climb Stairs: " + climbStairs(5));
        System.out.println("Coin Change: " +
                coinChange(new int[]{1, 2, 5}, 11));

        System.out.println("\nAll DSA demonstrations completed.");
    }
}
