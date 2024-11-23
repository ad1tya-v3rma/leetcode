package com.leetcode.problems.problems;

import com.leetcode.problems.test.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        int j=0;
        for(int i=0; i<m; i++)
        {
            if(nums1[i] == 0){
                continue;
            }
            list.add(nums1[i]);
            j++;
        }

        for(int i = 0; i<n; i++)
        {
            if(nums2[i] == 0){
                continue;
            }
            list.add(nums2[i]);
            j++;
        }
        j=0;
        int[] o = new int[list.size()];
        for(int i : list){
            o[j] = i;
            j++;
        }
        Arrays.sort(o);
        Arrays.stream(o).forEach(System.out::println);
    }
}
