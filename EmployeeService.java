package com.sj.empmanagmentapplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeService {

	HashSet<Employee> empset=new HashSet<Employee>();

	// Here, we have already created the data of 4 employee set in the hash set
	Employee emp1=new Employee(102, "Jack", 24, "Developer", "IT", 97000);
	Employee emp2=new Employee(104, "Sam", 26, "Tester","CO", 58000);
	Employee emp3=new Employee(101, "Bob", 20, "DevOps Eng","Admin", 85000);
	Employee emp4=new Employee(103, "Max", 27, "System Eng","CO",  90000);

	// Scanner object
	Scanner sc=new Scanner(System.in);
	boolean found=false;
	int id;
	String name;
	int age;
	String department;
	String designation;
	double sal;

	public EmployeeService() {

		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);

	}

	//Here, we have created a method to view all employees
	// In this method it will print all the employee alongwith their details
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	// In this method we will view employee based on their id
	public void viewEmp(){

		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			// If the employee id matches with the choice then print the employee details
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}

		}
		// If there is no employee with such id then we'll print not present
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	// In this method we will update the employee details
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
				System.out.println("Enter new Salary");
				sal=sc.nextDouble();
				System.out.println("Enter new Designation");
				designation=sc.next();
				emp.setName(name);
				emp.setSalary(sal);
				emp.setDesignation(designation);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
	}
	// In this method we will delete the employee
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	// In this method we will add the employee
	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("enter Designation");
		designation=sc.next();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter salary");
		sc.nextDouble();

		// Here, we will create a new employee to add it
		Employee emp=new Employee(id, name, age, designation, department, sal);

		// Here, we'll add the employee
		empset.add(emp);

		System.out.println(emp);
		System.out.println("Employee added successfully");

	}

}

