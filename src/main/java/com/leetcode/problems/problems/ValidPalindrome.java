package com.leetcode.problems.problems;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        for(char ch : s.toCharArray())
        {
            if(!(Character.isLetter(ch) || Character.isDigit(ch)))
            {
                s=s.replace(ch + "", "");
            }
        }
        StringBuilder sb = new StringBuilder(s);
        if(s.equalsIgnoreCase(sb.reverse().toString()))
            return true;

        return false;
    }
}
