package studyJava13.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx_01 {
	
	/* 
	 * PrintStream 
	 * OutputStream의 하위 클래스로서 출력기능을 강화시킨 클래스이다. 
	 * PrintStream의 대표적인 메서드 
	 * println() , print(), printf()메서드가 있다. 
	 * 이 메서드들은 모든 자료형을 출력하도록 오버로딩되어 있고, 예외처리 없이도 출력이 가능하도록 되어있다. 
	 */
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("print.txt",true);
			PrintStream ps = new PrintStream(fos);
			ps.println("홍길동"); 
			ps.println(1111); 
			ps.println(true);
			ps.println(3.14); 
			ps.flush(); 
			ps.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
