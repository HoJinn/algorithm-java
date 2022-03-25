package studyJava13.IO;

import java.io.IOException;
import java.io.OutputStream;

/*
 * Writer() 메서드
 * 
 * OutputStream 클래스의 출력을 위한 메서드는 write()인데 예외처리도 해야하고 출력가능한 자료형도 한정적이다. 
 */
public class OutputStreamEx_01 {

	public static void main(String[] args) {
		
		try {
			OutputStream out = System.out;
			out.write('a');
			out.write('b');
			out.write('c');
			out.write('1');
			out.write('2');
			out.write('3');
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
