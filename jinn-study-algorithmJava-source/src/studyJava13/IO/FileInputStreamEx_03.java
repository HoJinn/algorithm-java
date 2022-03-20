package studyJava13.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx_03 {
	
	/* 
	 * read(byte[]b, int off , int len) 메서드를 이용하여 예제를 만들어보자.
	 */
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = 
					new FileInputStream("src/studyJava13/IO/FileInputStreamEx_01.java");
			int data = 0; 
			byte[] buf = new byte[fis.available()];
			while ((data=fis.read(buf, 0, buf.length)) != -1) { 
				System.out.println(new String (buf, 0, data));
			}
			
		} catch (IOException e) {
			
		}
	}
}