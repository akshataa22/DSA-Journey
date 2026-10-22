package DSAPracticeSets.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {

        int[] nums = { 0, 0, 3, 3, 5, 5, 7, 7, 8, 8 };
        System.out.println(removeDuplicates(nums));

    }
}
