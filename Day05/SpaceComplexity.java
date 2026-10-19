package Day05;

import java.util.HashMap;

public class SpaceComplexity {
    public static void main(String[] args) {
        // Example A — Constant extra space
        int n = 3;
        int[] arr = {};
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        // The loop processes the input, but only uses a fixed number of extra
        // variables.
        // - Time: O(n)
        // - Auxiliary space: O(1), excluding the input array.

        // Example B — Extra array
        int[] copy = new int[n];

        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }

        // - Time: O(n)
        // - Auxiliary space: O(n)

        // Example C — Frequency map
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // If there are k distinct numbers:
        // - Time: expected O(n)
        // - Auxiliary space: O(k), which can be O(n) in the worst case.
    }
}
