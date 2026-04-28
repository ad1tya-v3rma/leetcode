package com.leetcode.problems.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> nMap = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            //nums[i] + complement = target
            int complement = target - nums[i];
            if(nMap.containsKey(complement))
            {
                return new int[]{nMap.get(complement),i};
            }
            nMap.put(nums[i],i);
        }
        return null;
    }
}
