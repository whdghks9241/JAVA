package com.kh.hw.person.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.hw.person.model.vo.Student;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Person;
import com.kh.hw.person.view.PersonMenu;

public class PersonController {

	private static final Student NULL = null;

	private Employee employee;
	
	private Person person;
	
	private Student student;
	
	private PersonMenu personMenu;
//
//	List<String> Student = new ArrayList<>();
//	List<Integer> Employee = new ArrayList<>();
	
	Student[] StudentList = new Student[3];
	Employee[] EmployeeList = new Employee[10];
	
	private int employeeCount = 0;

	private int StudentCount = 0;
	
	
	public int studentCount() {
		
		return StudentCount;
	}
	
	public int employeeCount() {
		
		return employeeCount;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
		student = new Student(name, age, height, weight, grade, major);

		StudentList[StudentCount] = student;
		
		StudentCount++;
	
	}
	
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
		employee = new Employee(name, age, height, weight, salary, dept);

		EmployeeList[employeeCount] = employee;
		
		employeeCount++;
	
	}
	

	public void printStudent() {
		
		// TODO Auto-generated method stub
		for (int i = 0; i < StudentCount; i++) {
			System.out.print(StudentList[i].getName() + ", ");
			System.out.print(StudentList[i].getAge() + ", ");
			System.out.print(StudentList[i].getHeight() + ", ");
			System.out.print(StudentList[i].getWeight() + ", ");
			System.out.print(StudentList[i].getGrade() + ", ");
			System.out.println(StudentList[i].getMajor());
		}
	}

	public void printEmployee() {
		
		// TODO Auto-generated method stub
		for (int i = 0; i < employeeCount; i++) {
			System.out.print(EmployeeList[i].getName() + ", ");
			System.out.print(EmployeeList[i].getAge() + ", ");
			System.out.print(EmployeeList[i].getHeight() + ", ");
			System.out.print(EmployeeList[i].getWeight() + ", ");
			System.out.print(EmployeeList[i].getDept() + ", ");
			System.out.println(EmployeeList[i].getSalary());
		}
	}
	
}
