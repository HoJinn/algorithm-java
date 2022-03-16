package studyJava13.IO;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01 {

	/* 
	 * 바이트 기반 입력 스트림 
	 * 바이트 단위로 데이터가 전송되며 최상위 스트림은 InputStream이다. 
	 * 이 InputStream은 하위 클래스에서 공통으로 사용하기 위한 입력 관련 추상 메서드가 포함되어 있는 추상 클래스로 직접 객체로 생성될수 없으며,
	 * 하위 클래스들이 상속받아 추상 메서드들을 구현하고 있다.  
	 */
	public static void main(String[] args) {
		
		try{
		InputStream in = System.in;
		int date = 0;
		while ((date=in.read()) != -1) { 
			System.out.println((char)date);
		}
	} catch (IOException e) {

			}
		}
	}