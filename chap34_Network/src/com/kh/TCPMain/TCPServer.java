package com.kh.TCPMain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(12345);
			System.out.println("Server Waiting");
			
			// 만약 클라이언트와 연결하고 싶다면 클라이언트와 연결하는 코드 작성
			while(true) {
				Socket client = serverSocket.accept();
				System.out.println("Connect Clinent. ");
				
				// 읽어올 때 
				InputStream instream = client.getInputStream();
				Scanner sc = new Scanner(instream);
				
				System.out.println("Server | Client  : " + sc.nextLine());
				
				OutputStream outStream = client.getOutputStream();
				PrintStream printStream = new PrintStream(outStream);
				
				printStream.print(" Hi Client ");
				System.out.println("Server | Client");
				// 버퍼의 데이터를 한번에 쏟아냄
				printStream.flush();
				
				client.close();
				System.out.println("Server " + client.getInetAddress() );
				
				
				// 만약 서버는 무한대로 실행이 되어야 하나
				// 실행 제한을 주고 싶을 떄
				int count = 1;
				if (count > 10) {
					serverSocket.close(); // 서버를 닫음
					System.out.println("Server Close");
				}
				
				count += 1;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
