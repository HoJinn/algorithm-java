package studyJava13.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx_01 {
	
	/*
	 * 입력스트림에 Buffer를 가지고 있는 문자형 입력 스트림 이다.  
	 * 버퍼에 있는 내용을 한 줄씩 읽을 수 잇는 readLione()메서드를 가지고 있는 보조스트림이다. 
	 * 
	 * 보조스트림이란? 
	 * 객체 생성시 기존의 스트림을 가지고 잇는 새로운 특징을 가지는 스트림을 말한다. 
	 * 스트림의 기능을 보완하기 위해 만들었기 때문에 직접 데이터를 입/출력하는 것은 아니지만 스트림의 기능을 향상시키거나 
	 * 새로운 기능을 추가 할 수 있다. 
	 * 그래서 스트림을 먼저 생성한 후 이를 이용해 보조 스트림을 생성하는 형태로 사용한다. 
	 * 
	 * 
	 * Buffered를 사용하는 이유
	 * 입출력을 할 때는 자바가 직접 하는 것이 아니고 운영체제를 Native메소드를 호춣래서 수행한다.
	 * 이런 이유로 입출력을 너무 번번히 수행하면 Native메소드를 너무 자주 호출하여 입출력 효율이 떨어질수 있으므로 
	 * Buffer에 모아서 처리하는 것이 효율적이다.  
	 */
	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null; 
		
		try {
			fr = new FileReader("src/studyJava13/IO/InputStreamEx_01.java");
			br = new BufferedReader(fr);
			
			String txt = null; 
				while ((txt = br.readLine()) != null) {
					System.out.println(txt);
				}
			} catch (IOException e) {
			
			} finally { 
				try { 
					fr.close();
					br.close();
				} catch (Exception e) {
			System.out.println(e);
				} 
			}
		}
	}
