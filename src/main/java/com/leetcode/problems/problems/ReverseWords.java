package com.leetcode.problems.problems;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        String rWords = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i] == "") {
                System.out.println(words[i]);
                continue;
            }
            rWords = rWords + words[i] + " ";

        }

        return rWords.trim();
    }
}
