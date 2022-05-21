package studyJava00.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class excerciseSter04 {
	
	// for문을 사용해서 * 찍기  
	public static void main(String[] args) throws IOException {
		
		// * 찍을 갯수 변수 선언 
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
		String n = br.readLine(); 
		int length = Integer.parseInt(n); 
		String Star = ""; 
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		// 반복문을 사용해서 * 추가 
		for(int i = 0; i<length; i++) { 
			Star = Star + "*";
			bw.write(Star +"\n");
			
		}
		
		// 값 출력 
		bw.flush();
		bw.close();
		br.close();
	}

}
