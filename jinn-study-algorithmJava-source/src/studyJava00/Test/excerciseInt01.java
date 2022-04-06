package studyJava00.Test;

import java.util.Scanner;

public class excerciseInt01 {
	
	/* 1 ~ 10 사이의 정수 한개를 입력 받아 홀수인지 짝수인지 확인하고 
	 * 홀수면 "홀수다" , 소수가 아니면 "짝수다." 라고 출력하세요. 
	 * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야합니다." 를 출력해보자 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 10 사이의 정수를 입력하세요 : "); 
		int num = sc.nextInt(); 
		
		if(num > 0 && num <= 10 ) { 
			if(num % 2 == 0 ) { 
				System.out.println("짝수"); 
			} else { 
				System.out.println("홀수");
			}
		} else { 
			System.out.println("1 ~ 10 사이의 정수를 입력해주세요. ");
		}
		
		sc.close();
	}

}
