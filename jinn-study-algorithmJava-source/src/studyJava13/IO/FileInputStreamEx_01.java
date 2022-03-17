package studyJava13.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx_01 {

	/* 
	 * FlieInputStream클래스
	 * FlieInputStream클래스는 파일에서 바이트 단위로 데이터를 읽을 수 있는 기능을 가진 클래스 이다. 
	 * 두개의 생성자를 가지고 있는데 하나는 문자열을 매개변수로 받는 생성자 이며 
	 * 하나는 File객체를 매개변수로 받는 생성자 이다. 
	 * 
	 * 이번예제는 파일명을 문자열 매개변수로 지정해 read()메서드로 읽어서 출력해보자. 
	 */
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = 
					new FileInputStream("src/studyJava13/IO/FileInputStreamEx_01.java");
			int data = 0; 
			while ((data=fis.read()) != -1) { 
				System.out.print((char)data);
			}
		} catch (IOException e) {

		}
	}

}
