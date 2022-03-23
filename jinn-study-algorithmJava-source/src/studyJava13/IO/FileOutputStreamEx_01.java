package studyJava13.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	
	/* 
	 * FileOutputStream 
	 * 파일에 바이트 단위로 데이터를 출력하기 위한 스트림이다.  
	 * write()메서드를 이용해 파일에 데이터를 출력해 보자. 
	 */
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("test.txt", true); //test.txt 파일 생성 완료 
			
			fos.write(68); 
			fos.write(69); 
			fos.write(70); 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}
}
