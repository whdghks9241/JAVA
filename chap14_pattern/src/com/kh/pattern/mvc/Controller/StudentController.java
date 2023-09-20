package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

/**
 * 모델과 뷰를 연결하는 곳
 * 사용자 입력을 처리하는 곳
 */

public class StudentController {
	// StudentModel
	private StudentModel studentmodel;
	
	// StudentView
	private StudentView studentview;
	
	public StudentController(StudentModel studentmodel, StudentView studentview) {
		this.studentmodel = studentmodel;
		this.studentview = studentview;
	}
	
	public void setStudentName(String name) {
		studentmodel.setName(name);
	}
	
	public void setStudentAge(int age) {
		studentmodel.setAge(age);
	}
	
	public String getStudentName() {
		return studentmodel.getName();
	}

	public int getStudentAge() {
		return studentmodel.getAge();
	}

	public void updateView() {
		studentview.displayInfo(studentmodel.getName(), studentmodel.getAge());
	}
}
