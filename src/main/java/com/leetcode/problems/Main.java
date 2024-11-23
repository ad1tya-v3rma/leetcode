package com.leetcode.problems;

import com.leetcode.problems.problems.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends MinIndexSum {

    public static void main(String[] args) {

        //Given an employees table, find the employees who have salary greater than that of any employee with the first name 'Aditya'
        //Assume that the table has first_name, last_name and salary

        //example : aditya, 1 , 200; aditya, 2 , 300;aditya , 3, 100 ;  rohan, 3, 700; raman, 5, 500; rohit, 4, 50;
        /*List<Employee> employeeList= new ArrayList<>();
        Employee e1 = new Employee("Aditya","Verma",400);
        employeeList.add(e1);
        employeeList.add(new Employee("Aman","Sharma",300));
        employeeList.add(new Employee("Manish","Lakhiwal",200));
        employeeList.add(new Employee("Deepak","Saini",100));

        System.out.println(e1);
        System.out.println("\nbefore sort\n"+employeeList);
        Collections.sort(employeeList, new EmployeeComparator());
        //Collections.reverse(employeeList);
        System.out.println("\nafter sort\n"+employeeList);*/
        Main main = new Main();
        /*System.out.println(main.minOperations(new int []{2,2,2,2,2,2,2}));
        //2,3,3,2,2,4,2,3,4
        //2,2,2,2
        System.out.println(main.minOperations(new int []{2,1,2,2,3,3}));*/

        //main.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3 );

        System.out.println(main.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}));

    }



}

