package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.UserController;
import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserClient {

	public static void main(String[] args) {
		/**
		 * mvc 패턴을 사용해서 학생 정보를 다루는곳
		 */
		// 모델 객체 생성
		UserModel user = new UserModel("전종환", 31);
	
		// 뷰 객체 생성
		UserView view = new UserView();
		
		// 컨트롤러 객체 생성
		UserController controller = new UserController(user, view);

		// 정보출력
	
	}

}
