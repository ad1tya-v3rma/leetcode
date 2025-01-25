package com.leetcode.problems.problems;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mainArray = new int[m + n];
        int i;
        for (i = 0; i < m; i++) {
            mainArray[i] = nums1[i];
        }
        for(int j =i; j<i+n;j++ )
        {
            mainArray[j] = nums2[j-i];
        }
        mergeSort(mainArray);
        //System.arraycopy(o,0,nums1,0,o.length);
        Arrays.stream(mainArray).forEach(System.out::println);
    }

    public void mergeSort(int[] mainArray) {
        if (mainArray.length < 2) {
            return;
        }
        int mid = mainArray.length / 2;
        int left = mid;
        int right = mainArray.length - mid;
        int[] leftArray = new int[left];
        int[] rightArray = new int[right];
        for (int i = 0; i < mid; i++) {
            leftArray[i] = mainArray[i];
        }
        for (int i = mid; i < mainArray.length; i++) {
            rightArray[i-mid] = mainArray[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

        merger(mainArray, leftArray, rightArray);
    }

    public void merger(int[] mainArray, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                mainArray[k] = left[i];
                i++;
            } else {
                mainArray[k] = right[j];
                j++;
            }
            k++;
        }

            while(i< left.length)
            {
                mainArray[k] = left[i];
                k++;
                i++;
            }

            while(j < right.length)
            {
                mainArray[k] = right[j];
                j++;
                k++;
            }
    }
}