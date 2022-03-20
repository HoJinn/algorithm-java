package studyJava13.IO;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamEx_02 {
	
	/* 
	 * 문자기반 입력 스트림의 최상위 클래스는 Reader클래스이다. 
	 * Reader클래스도 역시 추상 메서드를 가지고 잇는 추상 클래스로 직접객체로 생성 될 수 없다. 
	 * Reader클래스의 객체는 읽어들일 때의 기준이 문자 단위이다. (2byte 씩)
	 */
	public static void main(String[] args) {
		
		try{
			// InputStreamReader 객체 생성 
			Reader in = new InputStreamReader(System.in);
			int data = 0;
			while ((data=in.read()) != -1) { 
				System.out.print((char)data);
			}
		} catch (IOException e) {

				}
			}
		}