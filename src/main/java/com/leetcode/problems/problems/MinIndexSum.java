package com.leetcode.problems.problems;

import java.util.*;

public class MinIndexSum {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int lowestIndexSum = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>();
        List<String> list = Arrays.asList(list1);

        for (int i = 0; i < list2.length; i++) {
            if (list.indexOf(list2[i]) != -1) {
                int indexSum = list.indexOf(list2[i]) + i;
                if (lowestIndexSum > indexSum) {
                    lowestIndexSum = indexSum;
                    map.clear();
                }else if(lowestIndexSum == indexSum)
                {
                    map.put(list2[i], indexSum);
                }
            }
        }

        /*for (int i = 0; i < list2.length; i++) {
            if (list.indexOf(list2[i]) != -1) {
                int indexSum = list.indexOf(list2[i]) + i;
                if (lowestIndexSum == indexSum) {
                    map.put(list2[i], lowestIndexSum);
                }
            }
        }*/

        String result[] = new String[map.keySet().size()];
        int index = 0;
        for (String str : map.keySet()) {
            result[index] = str;
            index++;
        }

        return result;
    }
}
