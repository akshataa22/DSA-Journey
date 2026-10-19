package Day05;

public class BigOExamples {
    // Complexity Name Example
    // O(1) Constant Access arr[0]
    // O(log n) Logarithmic Repeatedly halve a search range
    // O(n) Linear Visit every array element
    // O(nlog n) Linearithmic Typical efficient comparison sorting
    // O(n^2) Quadratic Compare every pair using nested loops
    // O(2^n) Exponential Generate all subsets
    // O(n!) Factorial Generate all permutations

    // A. Linear recursion
    static void countdown(int n) {
        if (n <= 0)
            return;

        System.out.println(n);
        countdown(n - 1);
    }

    // Each call reduces n by one. There are approximately n calls.
    // - Time: O(n)
    // - Auxiliary call-stack space: O(n)

    // B. Binary search recursion
    // A recursive binary search discards half the remaining search range on each
    // call.
    // - Time: O(log n)
    // - Auxiliary stack space: O(log n)

    // C. Fibonacci recursion
    // Consider the naive recursive implementation:
    static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    // Each call can branch into two more calls. The naive implementation has
    // exponential time complexity, commonly bounded by \(O(2^n)\), and \(O(n)\)
    // maximum call-stack space.

    public static void main(String[] args) {
        // Rule A: Constant operations → O(1)
        int x = 10;
        int y = 20;
        int sum = x + y;
        System.out.println(sum);

        // Rule B: One loop → O(n)
        int n = 3;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        // The loop runs n times.

        // Rule C: Nested loops → often O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
            }
        }
        // The inner loop runs n times for each of the n outer iterations. Total
        // iterations: n times n = n^2.

        // Rule D: Consecutive loops → add, then simplify
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }

        // Total work is n+n=2n, so the complexity is O(n), not O(n^2).

    }
}
