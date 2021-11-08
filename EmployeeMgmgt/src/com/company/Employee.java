package com.company;

public class Employee {

    private int id;
    private String name , age , job;
    private double salary;

    public Employee(){

    }

    public Employee(int id , String name, String age, String job, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }


    public String toString()
    {
        return id + " " + name + " " + age + " " + job + " " + salary;
    }

}
