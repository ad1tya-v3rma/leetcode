package com.leetcode.problems;

import com.leetcode.problems.problems.RemoveDuplicatesFromSortedList;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList dupes = new RemoveDuplicatesFromSortedList(List.of(1, 2, 3, 4, 4, 5, 5, 6, 7, 7));
        dupes.printList(dupes.deleteDuplicates(dupes.getHead()));

        //System.out.println(main.);
    }
}
