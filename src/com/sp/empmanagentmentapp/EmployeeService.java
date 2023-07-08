package com.sp.empmanagentmentapp;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	
	HashSet<Employee> empset = new HashSet<Employee>();

	Employee emp1 = new Employee(101,"Shubham",24, 24000);	
	Employee emp2 = new Employee(102,"Arpit",25, 30000);
	Employee emp3 = new Employee(103,"Devendra",24, 50000);
	Employee emp4 = new Employee(104,"Amit",26, 60000);
	
	Scanner sc = new Scanner(System.in);
	boolean found = false;
	int id;
	String name;
	int age;
	double sal;
	
	
	
	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}
	// view all employees
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	//view emp based on there id
	public void viewEmp() {
		System.out.println("Enter id: ");
		id= sc.nextInt();
		for(Employee emp:empset)
		{
			if(emp.getId()==id)
			{
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("emp with this id not present");
		}
	}
	//update the employee
	
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset)
		{
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				
				name= sc.next();
				
				System.out.println("Enter new Salary");
				
				sal=sc.nextDouble();
				
				emp.setName(name);
				
                emp.setSalary(sal);	
                System.out.println("Updated Details of employee are:");
                System.out.println(emp);
                found=true;
                
                
			}
		}
	}
	//delete emp
	public void deleteEmp() {
		System.out.println("Enter id: ");
		id= sc.nextInt();
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
			System.out.println("Employee deleted");
		}
		
	}
	//add emp
	public void addEmp( ) {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		  System.out.println("Enter name");
		  name=sc.next();
		  System.out.println("Enter age");
		  age=sc.nextInt();
		  System.out.println("Enter sal");
		  sal=sc.nextDouble();
		  
		  Employee emp = new Employee(id, name, age, sal);
		  
		  empset.add(emp);
		  System.out.println(emp);
		  System.out.println("Employee added successfully");
		  
		  }
	
}
