package com.leetcode.problems;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() == e2.getSalary())
        {
            return e1.getFname().compareTo(e2.getFname());
        }
        else{
            if(e1.getSalary() < e2.getSalary())
                return 1;
            else if (e1.getSalary() > e2.getSalary()) {
                return -1;
            }
            else
                return 0;
        }

        /*if(e1.getFname().compareTo(e2.getFname()) > 0)
        {
            return 1;
        }
        else if(e1.getFname().compareTo(e2.getFname()) < 0)
        {
            return -1;
        }
        else{
            return 0;
        }*/
    }
}
