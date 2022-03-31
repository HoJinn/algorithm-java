package studyJava14.Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnectionEx_01 {
	
	/* 
	 * URL클래스를 이용해서 웹페이지의 내용을 읽어오는 예제를 만들어 보자. 
	 */
	public static void main(String[] args) {
		URL url = null; 
		String address = 
					"https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submeni=1";
		BufferedReader br = null; 
		String readline = ""; 
		
		try {
			url = new URL(address);
			br = new BufferedReader ( 
										new InputStreamReader (url.openStream()));
			
			while ((readline = br.readLine()) != null) { 
				System.out.println(readline);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { 
			try { br.close();} catch(Exception e) {}
		}
	}

}
