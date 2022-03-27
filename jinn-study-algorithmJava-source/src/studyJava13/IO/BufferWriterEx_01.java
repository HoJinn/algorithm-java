package studyJava13.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx_01 {

	/* 
	 * Buffered보조스트림 
	 * 보조 스트림 클래스 중에서 아주 유용하게 사용되고, 사용빈도도 높은 Buffered보조 스트림에 대해 알아보자 
	 * 
	 * Buffered스트림 클래스를 사용하는 이유
	 * 바이트 기반 스트림이나 문자기반 스트림이나 마찬가지로 처리속도가 월등히 빠르다. buffer는 중간에서 임시로 
	 * 저장하는 역할을 하는 저장소의 의미가 있다.
	 * 하나하나 읽어오고 저장하는게 아니라 특정 길이만큼 모아뒀다가 한꺼번에 저장하기 때문에 속도가 훨씬 빠르다.  
	 */
	public static void main(String[] args) {
		
		try {
			FileWriter fw = 	
					new FileWriter("test4.txt");
			BufferedWriter bw = new BufferedWriter(fw); //FileWriter객체를 BufferedWriter생성자에 매개변수로 넘겨준다. 밑에 매서드들을 객체를 통해 실행했다.
			
			//문자하나 출력 
			bw.write('a');
			char[] buf = {'B','C' , 'D'}; 
			
			//문자배열 출력 
			bw.write(buf);
			
			//문자배열 off부터 len개수만큼 출력 
			bw.write(buf,1,2);
			
			//문자열 출력 
			bw.write("저는 신입 개발자 최호진 입니다.");
			
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
