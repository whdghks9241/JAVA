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
//	int[] Employee = new int[10];
	
//	int personCount;

	int StudentCount = 0;
	
//	public int personCount() {
//		
//		int pcnt = 0;
//
//		for(Student list : StudentList){
//			
//			pcnt++;
//		}
//		
//		return pcnt;
//	}
	
	public int printStudent() {
		
		
		
		if (StudentList[0] == NULL) {
			StudentCount = 0;
		} else if (StudentList[1] == NULL) {
			StudentCount = 1;
		}
		
		return StudentCount;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
		student = new Student(name, age, height, weight, grade, major);
		
		StudentList[0] = student;
		
	}

}
