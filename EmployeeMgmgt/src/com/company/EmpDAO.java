package com.company;


import java.util.*;

public class EmpDAO {

    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in); // to read string data

    List<Employee> list = new ArrayList<Employee>();

    public void addEmp(){
        System.out.println("Enter Emp Id : ");
        int empId = s.nextInt();

        System.out.println("Enter Emp Name : ");
        String empName = s1.nextLine();

        System.out.println("Enter Emp Age : ");
        String empAge = s1.nextLine();

        System.out.println("Enter Emp Job : ");
        String empJob = s1.nextLine();

        System.out.println("Enter Emp Salary : ");
        double empSalary = s.nextDouble();

        list.add(new Employee(empId , empName , empAge , empJob , empSalary));
    }


    public void getEmp(){
        if(list.isEmpty()){
            System.out.println("** No data **");
        }

        for (Employee emp : list){
            System.out.println(emp);
        }



        //return null;
    }


    public void UpdateEmp(int empId)
    {
        boolean flag = false;

        ListIterator<Employee> li = list.listIterator();
        while (li.hasNext()) {
            Employee emp = li.next();
            if (emp.getId() == empId) {
                System.out.println("Enter New Employee Name : ");
                String empName = s1.nextLine();

                System.out.println("Enter New Employee Age : ");
                String empAge = s1.nextLine();

                System.out.println("Enter New Employee Job : ");
                String empJob = s1.nextLine();

                System.out.println("Enter New Employee Salary : ");
                double empSalary = s.nextDouble();
                // set Emp with new updated data
                li.set(new Employee(empId, empName, empAge, empJob, empSalary));
                flag = true;
            }
        } // end while iterator .
        System.out.println(flag ? "** Updated Successfully **" : "** No Data for this ID **");
    }

    public void DeleteEmp(int empId) {
        boolean flag = false;

        Iterator<Employee> loop = list.iterator();
        while (loop.hasNext()) {
            Employee emp = loop.next();
            if (emp.getId() == empId) {
                loop.remove();
                flag = true;
            }
        }

        System.out.println(flag ? "** Deleted Successfully **" : "** No Data for this ID **");
    }

}

