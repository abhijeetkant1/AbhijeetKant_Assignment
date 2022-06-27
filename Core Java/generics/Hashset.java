package com.cg.generics;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Employee> act= new HashSet();
        Employee a=new Employee(1,"Vivek",30000,"Dev");
        Employee b=new Employee(2,"Dev",20000,"Q/A");
        Employee c=new Employee(3,"Aditya",30000,"Dev");
        Employee d=new Employee(4,"Saurav",50000,"Manager");
        act.add(a);
        act.add(b);
        act.add(c);
        act.add(d);
        //printing all the details of the objects
        System.out.println(act);
    }
}
class Employee{
    int id,salary;
    String name,dept;
    public Employee(int id, String name, int salary, String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    @Override
    public String toString(){
        return "{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}";
    }
    @Deprecated
    public void displayDetails(){
        System.out.println("{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}");
    }
}
