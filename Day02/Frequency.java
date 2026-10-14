package Day02;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};

         for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Count occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Print only the first occurrence of each number
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                System.out.println(arr[i] + " -> " + count);
            }
        }

    }
}
