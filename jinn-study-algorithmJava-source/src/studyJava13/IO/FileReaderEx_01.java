package studyJava13.IO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx_01 {
	
	/* 
	 * FileReader 클래스
	 * 파일을 읽을 때 파일의 경로나 File객체를 생성자의 매개변수로 지정할수 있다. 
	 * 파일이 존재하지 않으면 FileNotFoundException 예외를 발생시킨다. 
	 * FileReader클래스는 FileInputStream클래스와 달리 문자 스트림으로 한 글자씩 읽기 때문에 한글이 깨지지 않는다. 
	 */
	public static void main(String[] args) {
		
		FileReader fr = null; 
		
			try {
				fr = new FileReader ("src/studyJava13/IO/InputStreamEx_01.java");
				int data = 0;
				while ((data = fr.read()) != -1) { 
					System.out.print((char)data);
				}
			} catch (IOException e) {
				
			} finally {
				try {
					fr.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
