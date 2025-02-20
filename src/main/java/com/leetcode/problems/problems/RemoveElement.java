package com.leetcode.problems.problems;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val)
            {
                nums[count] = nums[i];
                count++;
            }
            /*if(nums[i] == val && count <2)
            {
                while(nums[nums.length-count-1] == val)
                {
                    count++;
                }
                int temp = nums[i];
                nums[i] = nums[nums.length-count-1];
                nums[nums.length-count-1] = temp;
            }*/
        }
        Arrays.stream(nums).forEach(System.out::println);
        return count;
    }
}
