package com.kh.practice.exam;

public class Practice30 {
	
	private int grade, classroom;
	
	private String name;
	
	private double height;
	
	private char gender;

	public int getGrade() {
		return grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}

	public char getGender() {
		return gender;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void information() {

		System.out.println(grade + "학년");
		System.out.println(classroom +"반");
		System.out.println("이름 : " + name);
		System.out.println(" 키 : " + height);
		System.out.println("성별 : " + gender);
	}

}
