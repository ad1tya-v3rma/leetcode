package com.leetcode.problems.problems;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        if (nums.length == 1) {
            list.add(nums[0]);
            return list;
        }
        int majorityElement = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++)
        {
            if(count == 0)
            {
                majorityElement = nums[i];
            }
            if(count >= nums.length/3)
            {
                list.add(majorityElement);
            }
            if(nums[i] == majorityElement)
            {count++;}
            else
            {
                count--;
            }

        }
        return list;
    }
}
