package studyJava00.Test;

import java.util.Scanner;

public class excerciseString_Re02 {
	
	/* 
	 * 정수를 입력받아 입력받은 정수가 
	 * 홀수이면 "개", 짝수이면 "발" 이 정수만큼 누적되어 출력되는 메소드 복습해보자. 
	 */
	public static void main(String[] args) {
		String str1 = "개"; 
		String str2 = "발"; 
		String result = ""; 
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		
		for(int i = 1; i <=num; i++) { 
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
