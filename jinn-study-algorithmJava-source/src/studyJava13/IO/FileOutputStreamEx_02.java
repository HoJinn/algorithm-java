package studyJava13.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_02 {
	/* 
	 * FileOutputStream 
	 * 이번에는 write(byte[] b) 메서드를 사용해서 입력과 만찬가지로 데이터를 한번에 출력해보자. 
	 */
	public static void main(String[] args) {
		
		try { 
			
		FileOutputStream fos = new FileOutputStream("test2.txt",true); 
		
		byte[] b = new byte[26]; // 26자리의 byte배열 
		byte data = 65; 
		for (int i=0; i<b.length; i++) {	// 65부터 1씩 증가하며 배열의 각 인데스에 값 대입
			b[i] = data;
			data++; 
	}
	fos.write(b);
	} catch(IOException e) { 
		System.out.println(e.getMessage());
	}
	}
}