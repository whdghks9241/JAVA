package com.kh.ThreadMain;

public class StudentThread extends Thread{
	
	private String studentName;
	
	public StudentThread(String name) {
		this.studentName = name;
	}
	
	public void runt() {
		
		System.out.println(studentName + "가(이) 공부를 시작합니다.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(studentName + "가 공부를 마칩니다.");
	}

}
