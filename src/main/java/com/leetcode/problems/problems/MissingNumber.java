package com.leetcode.problems.problems;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=binary-search
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for (i = 0; i < nums.length; i++) {
            if (!isPresent(i, nums)) {
                break;
            }
        }
        return i;
    }

    public boolean isPresent(int num, int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (num == nums[mid]) {
                return true;
            } else if (num > nums[mid]) {
                start = mid + 1;
            } else if (num < nums[mid]) {
                end = mid - 1;
            }
            mid = (start + end) / 2;

        }
        return false;
    }
}
