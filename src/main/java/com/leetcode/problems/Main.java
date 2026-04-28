package com.leetcode.problems;

import com.leetcode.problems.problems.RemoveDuplicatesFromSortedList;
import com.leetcode.problems.problems.TwoSum;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends TwoSum {

    public static void main(String[] args) {
      System.out.println(Arrays.toString(new Main().twoSum(new int[]{2, 7, 11, 15}, 9)));
        /*Map<String, String> map = new HashMap<>();
        List<Employee> list= new ArrayList<>();
        list.stream().filter(obj -> obj.getSalary()>200).collect(
                Collectors.groupingBy(
                        Employee::getSalary,
                        Collectors.mapping(Employee::getFname, Collectors.toList()) )
        );
        list.stream().collect(Collectors.toMap(Employee::getFname, Employee::getSalary));
        String str = "aaabbbas";
        Map<Character, Long> frequenceMap = Arrays.stream(str.chars().toArray()).mapToObj(c -> (char) c) .collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );

        frequenceMap.entrySet().forEach(
                obj -> System.out.println(obj.getKey() + ": " + obj.getValue())
        );
*/
        //System.out.println(main.);
    }
}
