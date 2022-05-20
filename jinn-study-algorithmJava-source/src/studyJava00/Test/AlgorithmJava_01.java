package studyJava00.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class AlgorithmJava_01 {
	
	/* 
	 * 두 정수 A와 B를 입력 받은 다음, A+B를 출력하는 프로그램을 작성하시오. 
	 * 
	 * 입력 : 첫째 줄에 A와 B가 주어진다.(0<A,B<1010000)
	 * 
	 * 출력 : 첫째줄에 A+B를 출력한다. 
	 */
	public static void main(String[] args) throws IOException {
		
		// BufferedReader 및 StringTokenizer 선언 및 입력 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		
		// BingInterger 선언 및 a + b 
		BigInteger a = new BigInteger(st.nextToken()); 
		BigInteger b = new BigInteger(st.nextToken()); 
		a= a.add(b); 
		
		System.out.println(a); // 결과출력
	}
}
