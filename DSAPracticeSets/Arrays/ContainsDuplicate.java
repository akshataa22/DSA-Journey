package DSAPracticeSets.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean isDuplicate = false;
        for (int num : nums) {
            if (set.contains(num)) {
                isDuplicate = true;
                break;
            } else {
                set.add(num);
            }
        }
        return isDuplicate;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 5, 8 };

        System.out.println((containsDuplicate(input)));
    }
}
