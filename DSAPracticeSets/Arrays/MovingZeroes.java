package DSAPracticeSets.Arrays;

import java.util.Arrays;

public class MovingZeroes {
    public static void main(String[] args) {
        int[] nums = { 6, 0, 2, 0, 3 };
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println("Zeroes to the end of the existing array: " + Arrays.toString(nums));
    }
}
