package com.kh.finalSample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {

	public static void main(String[] args) {
		int port = 1414;
		
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			System.out.println("서버가 포트 " + port + " 에서 실행 중입니다.");
			
			
			while(true) {

				// 클라이언트 연결
				Socket client = server.accept();
				System.out.println("클라이언트 연결 : " + client.getInetAddress());
				
				
				client.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
