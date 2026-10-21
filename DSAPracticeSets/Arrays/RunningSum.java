package DSAPracticeSets.Arrays;

import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 5, 8 };
        // if non-static method called then by obj method will be called
        // RunningSum obj = new RunningSum();
        // System.out.println(Arrays.toString(obj.runningSum(input)));
        System.out.println(Arrays.toString(runningSum(input)));
    }
}