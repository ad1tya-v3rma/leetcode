package com.leetcode.problems.problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
        public int romanToInt(String s) {
            Map<String, Integer> map = new HashMap<>();
            int result=0;
            map.put("I", 1);
            map.put("V", 5);
            map.put("X", 10);
            map.put("L", 50);
            map.put("C", 100);
            map.put("D", 500);
            map.put("M", 1000);
            char[] ch = s.toCharArray();
            for(int i=ch.length-1;i>=0;i--)
            {
                if(i>=0&& i!=ch.length-1)
                {
                    if(map.get(ch[i+1]+"") > map.get(ch[i]+"")){
                        result = result - map.get(ch[i]+"");
                    }
                    else {
                        System.out.println(ch[i]);
                        result = result + map.get(ch[i] + "");
                    }
                }
                else {
                    System.out.println(ch[i]);
                    result = result + map.get(ch[i] + "");
                }
            }
            System.out.println(result);
            return result;
        }
}
