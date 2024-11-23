package com.leetcode.problems.problems;

import java.util.Arrays;

public class LongestHarmoniusSequence {
    public int findLHS(int[] nums) {
        int count = 0;
        int maxLen = 0;
        Arrays.sort(nums);
        for(int i = 0, j = nums.length-1; i<nums.length && j>0; )
        {
            int temp[] = createArray(nums, i, j);
            int min = findMin(temp);
            int max = findMax(temp);
            if(Math.abs(min - max) == 1)
            {
                maxLen = temp.length > maxLen ? temp.length : maxLen;
            }

            i++;
            j--;

        }
        return maxLen;
    }
    public int[] createArray(int a[], int start , int end)
    {

        int actLen = end-start+1;
        int temp[] = new int[actLen];
        for(int i = 0; i < actLen; i++,start++)
        {
            temp[i] = a[start];
        }
        /*while(start <= end)
        {
            temp[start] = a[start];
            start++;
        }*/
        return temp;
    }
    public int findMin(int a[])
    {
        Arrays.sort(a);
        return a[0];
    }
    public int findMax(int a[])
    {
        Arrays.sort(a);
        return a[a.length-1];
    }
}
