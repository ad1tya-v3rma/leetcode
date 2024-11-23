package com.leetcode.problems.problems;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubstringWithUniqueCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> uniqueCharSet = new HashSet<>();
        //abcadea
        int start = 0;
        int end = 0;
        int maxLength = 0;
        while(end < s.length())
        {
            if(!uniqueCharSet.contains(s.charAt(end)))
            {
                uniqueCharSet.add(s.charAt(end));
                if(maxLength < uniqueCharSet.size())
                {
                    maxLength = uniqueCharSet.size();
                }
                end++;
            }
            else
            {
                uniqueCharSet.remove(s.charAt(start));
                start++;
            }
        }
        System.out.println(uniqueCharSet.toString());
        //uniqueCharSet.stream().collect(Collectors.toSet());//forEach(System.out::println);
        return maxLength;
    }

    public boolean isUnique(String str) {
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return false;
            } else {
                set.add(ch);
            }
        }
        return true;
    }
}
