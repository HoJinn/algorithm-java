package studyJava00.Test;

import java.util.Scanner;

public class excerciseString04 {

	public static void main(String[] args) {
	/* 
	 * 정수를 입력 받아 1부터 입력 받은 정수까지 
	 * 홀수이면 "수" ,짝수이면 "박" 이 정수만큼 누적되어 출력되는 메소드 작성해보자. 
	 */
		
	String str1 = "수"; 
	String str2 = "박"; 
	String result = ""; 
	
	Scanner sc = new Scanner(System.in); 

	System.out.println("정수 입력 : ");
	int num = sc.nextInt(); 
	
	for(int i = 1; i <= num; i++) { 
		if(i % 2 != 0) { 
			result += str1; 
		} else { 
			result += str2;
		}
	}
			System.out.println(result);
			sc.close();
	}
}
