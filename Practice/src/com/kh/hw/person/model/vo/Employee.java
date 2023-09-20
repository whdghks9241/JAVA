package com.kh.hw.person.model.vo;

public class Employee extends Person {

	private String dept;
	
	private int salary;
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name,age, height, weight);
		this.dept = dept;
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
