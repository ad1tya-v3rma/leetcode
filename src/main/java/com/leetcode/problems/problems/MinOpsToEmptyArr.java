package com.leetcode.problems.problems;

import java.util.HashMap;
import java.util.Map;

public class MinOpsToEmptyArr {
    public int minOperations(int[] nums) {
        //[2,3,3,2,2,4,2,3,4]
        //[2,2,2,2,3,3,3,4,4]
        int minOps = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                int temp = map.get(i) + 1;
                map.put(i, temp);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int val = e.getValue();
            if(val == 1)
            {
                return -1;
            }
            else if (val % 3 == 0) {
                int temp = val;
                minOps += (temp / 3);
            } else if (val % 3 > 0) {
                //11/3 = 3, r=2
                //10/3 = 3, r=1
                //4/3 = 1, r =1
                int temp = val % 3;
                int result = (val / 3);
                if (temp % 2 == 0) {
                    minOps += (result + (temp / 2));
                } else {
                    result -= 1;
                    minOps += (result + ((val - (result*3)) / 2));
                }
            } else if (val % 2 == 0) {
                int temp = val;
                minOps += (temp / 2);
            } else {
                return -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        return minOps;
    }
}
