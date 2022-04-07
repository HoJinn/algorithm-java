package studyJava00.Test;

import java.util.Scanner;

public class excerciseInt02 {
	
	/* 
	 * 두 개의 정수를 입력 받아 변수에 저장하고 
	 * 연산기호를 입력 받아 해당 연산의 수행 결과를 출력하는 예제를 만들어 보자 . 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		System.out.print("연산기호를 입력하세요 : ");
		char cp = sc.next().charAt(0);

		sc.close();
		
		int result = 0;
		
		switch(cp){
			case '+' : 
				result = num1 + num2;
				break;
			case '-' : 
				result = num1 - num2; 
				break;
			case '*' : 
				result = num1 * num2; 
				break;
			case '/' : 
				result = num1 / num2; 
				break;
			case '%' : 
				result = num1 % num2; 
				break;
			default : 
		}
		System.out.println(num1 + " " + cp + " " + num2 + " = " + result);
	}
} 
