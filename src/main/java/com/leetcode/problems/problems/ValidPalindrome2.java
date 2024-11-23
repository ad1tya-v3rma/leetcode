package com.leetcode.problems.problems;

public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        boolean flag = false;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end) && !flag) {
                if (s.charAt(start) == s.charAt(end - 1)) {
                    s = s.replace(s.charAt(end) + "", "");
                } else {
                    s = s.replace(s.charAt(start) + "", "");
                }
                start = 0;
                end = s.length() - 1;
                flag = true;
            }
            if(flag)
            {
                break;
            }
            start++;
            end--;
        }
        StringBuilder sb = new StringBuilder(s);
        if (s.equals(sb.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
}
