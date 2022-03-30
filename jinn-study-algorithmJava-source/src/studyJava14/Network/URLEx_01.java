package studyJava14.Network;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class URLEx_01 {
	/*
	 * URL 
	 * 인터넷을 통하여 서버에 접근하기 위해 URL클래스를 사용한다.  
	 * URL클래스는 인터넷에 접근할 수 있는 형태는 분석하는 클래스이다.  
	 * 
	 * URL구조 
	 * 프로토콜://호스트명:포스번호/경로명/파일명?쿼리스트링 
	 */
	public static void main(String[] args) {
		
		try {
			URL url = null; 
			url = 
		new URL("https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1");
			System.out.println("authority : " + url.getAuthority());
			System.out.println("connent : " + url.getContent());
			System.out.println("protocol : " + url.getProtocol());
			System.out.println("host : " + url.getHost());
			System.out.println("port : " + url.getPort());
			System.out.println("path : " + url.getPath());
			System.out.println("file : " + url.getFile());
			System.out.println("query :" + url.getQuery());
			
			//URL을 통해서 정보 받기 
			int data = 0; 
			try { 
			Reader is = new InputStreamReader(url.openStream()); 
			while ((data = is.read()) != -1) { 
				System.out.println((char) data);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (Exception e) { 
		System.out.println(e.getMessage());
		}
	}
}
