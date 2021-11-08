package com.company;

import java.util.Scanner;

public class EmpConsole {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);

        EmpDAO obj = new EmpDAO();
        int ch;
        do{
            printNecessaryInformation();

            ch = s.nextInt();

            switch (ch){
                case 1:
                    obj.addEmp();
                    System.out.println("New Employee Added Successfully ");
                    break;

                case 2:
                    System.out.println("*** List of Employees ***");
                    obj.getEmp();
                    break;

                case 3:
                    System.out.println("Updating Process ....");
                    System.out.println("Enter Emp ID to Update : ");
                    obj.UpdateEmp(s.nextInt());
                    break;

                case 4:
                    System.out.println("Deleting Process ....");
                    System.out.println("Enter Emp ID to Delete : ");
                    obj.DeleteEmp(s.nextInt());
                    break;
            }

        }while (ch != 0);
        System.out.println("Thank you .. ^^");
    }

    private static void printNecessaryInformation(){
        System.out.println("***********************************************************");

        System.out.println("** Employee Management System **");
        System.out.println("Please Select your choice from the menu to proceed : ");
        System.out.println("1- Insert New Employee");
        System.out.println("2- List All Employees");
        System.out.println("3- Update an Employee");
        System.out.println("4- Delete an Employee");
        System.out.println("0- Exit ");

        System.out.println("***********************************************************");
    }
}
