package com.leetcode.problems;

import java.util.Comparator;

public class Employee {
    private String fname;
    private String lname;
     private int salary;

    public Employee(String fname, String lname, int salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return this.getClass()+"{"+this.getFname()+",\t"+this.lname+",\t"+this.getSalary()+"}";
    }

}