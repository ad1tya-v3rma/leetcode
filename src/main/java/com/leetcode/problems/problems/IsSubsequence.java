package com.leetcode.problems.problems;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int init = 0;
        int match = 0;
        System.out.println("s  : " +s);
        System.out.println("t  : " +t);
        for(int i = 0; i<s.length(); i++){
            System.out.println(init);

            for(int j=init;j<t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    init = j+1;
                    match++;
                    break;
                }
            }
        }
        return match == s.length();
    }
}
