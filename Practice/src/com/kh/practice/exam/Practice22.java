package com.kh.practice.exam;

public class Practice22 {

	public static void main(String[] args) {
	
		/**
		 	�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���.
			��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���.
			ex.
			�ֹε�Ϲ�ȣ(-����) : 123456-1234567
			123456-1*****
		 */
		String jumin = "123456-1234567";
		
		// 2. �����ڸ� ���� ��ǥ ����°� �����
		String makester = "*";
		
		// �ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ���
		// to char Array�� ����ؼ� String -> char Array�� 
		char[] juminStar = jumin.toCharArray();
	}
}
