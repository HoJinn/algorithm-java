package studyJava14.Network;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx_01 {

	/* 
	 * TCP소켓 프로그래밍 
	 * 간단한 소켓으로 통신하는 웹서버 프로그램 예제를 구현해보자.
	 */
	public static void main(String[] args) {
		
		//소켓생성 
		ServerSocket server = null; 
		
		try { 
			server= new ServerSocket(9999);
		
		//무한 반복 (클라이언트 접속 대기) 
		while (true) { 
			System.out.println("클라이언트 접속대기");
			Socket client = server.accept();
			System.out.println("스레드 생성");
//			HttpThread ht = new HttpThread(client);
//			ht.start(); 
		}
	} catch (Exception e) { 
		System.out.println(e.getMessage());
	} finally { 
		try { 
			server.close();
		} catch (Exception e) { 
		System.out.println(e.getMessage());
			}
		} 
	}
} 