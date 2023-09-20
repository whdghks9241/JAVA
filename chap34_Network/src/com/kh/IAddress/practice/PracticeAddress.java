 package com.kh.IAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	// 도메인 주소 추가
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("www.nate.com");
			
			System.out.println("Hos Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
