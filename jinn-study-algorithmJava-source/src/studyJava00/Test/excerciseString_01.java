package studyJava00.Test;

import java.util.Scanner;

public class excerciseString_01 {

	/* 
	 * 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.  
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine(); 
		
		for(int i = 0; i< str.length(); i++) { 
			System.out.println(i + ":" + str.charAt(i));
		}
		
		sc.close();
	}

}
