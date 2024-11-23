package com.leetcode.problems.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfAllVowels {
    private Set<String> vowelSet = new HashSet<>(List.of(new String[]{"a", "e", "i", "o", "u"}));

    public long countVowels(String word) {
        long l = word.length();
        long total = 0;
        for (long i = 0; i < l; i++) {
            if (vowelSet.contains(word.charAt((int) i) +"")) {
                total += (l - i) * (i + 1);
            }
        }
        return total;
    }

}
