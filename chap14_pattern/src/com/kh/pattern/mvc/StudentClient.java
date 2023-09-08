package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.StudentController;
import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentClient {

	public static void main(String[] args) {

		// 모델 객체 생성 Model
		StudentModel model = new StudentModel("학생1번", 18);
		// 뷰 객체 생성 View
		StudentView view = new StudentView();
		// 컨트롤러 객체 생성 Controller(모델 뷰 생성)
		StudentController controller = new StudentController(model, view);
		// 학생 정보를 업데이트 해서 출력
		controller.updateView();
		// 학생 정보 업데이트를 하자!
		controller.setStudentName("2번");
		// 업데이트 된 학생 정보를 출력.
		controller.setStudentAge(18);
		controller.updateView();
	}

}
