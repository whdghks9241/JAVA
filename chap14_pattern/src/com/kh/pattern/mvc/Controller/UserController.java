package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserController {

	/**
	 * 모델과 뷰를 연결하는 곳
	 * 사용자 입력을 처리하는 곳
	 */
	private UserModel model;
	private UserView view;


	public UserController(UserModel model, UserView view) {
		this.model = model;
		this.view = view;
	
	}

	public UserModel getModel() {
		return model;
	}

	public UserView getView() {
		return view;
	}

	public void setModel(UserModel model) {
		this.model = model;
	}

	public void setView(UserView view) {
		this.view = view;
	}

}
