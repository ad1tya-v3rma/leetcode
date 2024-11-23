package com.leetcode.problems.problems;

//Leetcode problem 58 https://leetcode.com/problems/length-of-last-word/
public class LengthOfTheLastWord{
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        boolean isFirst = true;
        int length = 0;
        while(i>=0)
        {
            char ch = s.charAt(i);
            //approach 1
            if(ch == ' ' && isFirst)
            {
                i--;
            } else if (ch == ' ' && !isFirst) {
                break;
            } else
            {
                isFirst = false;
                length++;
                i--;
            }
            //approach 2
            /*while(ch == ' ' && isFirst)
            {
                i--;
                ch = s.charAt(i);
                if(ch != ' ') {
                    isFirst = false;
                }

            }
            if(ch == ' ')
                break;
            length++;
            i--;*/
        }
        return length;
    }
}