package com.leetcode.problems.problems;

import java.util.List;

//leetcode problem 2824 https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class SumLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        int pairCount = 0;
        int i = 0;
        int j = 1;
        while(j<nums.size())
        {
            if(i==j)
            {
                i=0;
                j++;
                continue;
            }
            else if((nums.get(i) + nums.get(j)) < target)
            {
                System.out.println("["+i+","+j+"]");
                //System.out.println("["+nums.get(i)+","+nums.get(j)+"]");
                pairCount ++;
            }
            i++;
        }
        return pairCount;
    }
}
