package studyJava13.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx_02 {
	
	/* 
	 * read(bate[] b) 메서드를 이용해서 내용을 한꺼번에 읽어와 출력해보는 예제를 만들어 보자.
	 * 
	 */
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = 
					new FileInputStream("src/studyJava13/IO/FileInputStreamEx_01.java");
			int data = 0; 
			byte[] buf = new byte[fis.available()]; //해당 파일의 읽기 가능 바이트수를 배열 크기로 지정한 것. 즉 파일의 바이트 크기만큼 배열을 선언한 것이다. 
			while ((data=fis.read(buf)) != -1) { 
				System.out.println(new String (buf, 0, data));
			}
		} catch (IOException e) {
			
		}
		
	}

}
