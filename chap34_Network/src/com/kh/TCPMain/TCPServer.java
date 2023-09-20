package com.kh.TCPMain;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(810);
			System.out.println("서버 대기 중!");
			
			// 만약 클라이언트와 연결하고 싶다면 클라이언트와 연결하는 코드 작성
			while(true) {
				Socket client = serverSocket.accept();
				System.out.println("클라이언트와 연결되었습니다.");
				
				client.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
