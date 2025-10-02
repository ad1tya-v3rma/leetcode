package com.leetcode.problems.problems;

import java.util.HashMap;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        var charMap = new HashMap<Character, Character>();
        // var set1 = new HashSet<Character>();
        // var set2 = new HashSet<Character>();
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!charMap.containsKey(s.charAt(i))) {
                charMap.put(s.charAt(i), t.charAt(i));
            } else {
                char temp = charMap.get(s.charAt(i));
                if (temp != t.charAt(i)) {
                    return false;
                }
            }
        }


        charMap.clear();


        for (int i = 0; i < t.length(); i++) {
            if (!charMap.containsKey(t.charAt(i))) {
                charMap.put(t.charAt(i), s.charAt(i));
            } else {
                char temp = charMap.get(t.charAt(i));
                if (temp != s.charAt(i)) {
                    return false;
                }
            }
        }

        // for(Character ch : s.toCharArray()){
        //     set1.add(ch);
        // }

        // for(Character ch : t.toCharArray()){
        //     set2.add(ch);
        // }

        // return set1.size() == set2.size();
        return true;
    }
}
