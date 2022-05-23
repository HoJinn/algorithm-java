package studyJava00.Test;

import java.util.Scanner;

public class excerciseInt05 {

	public static void main(String[] args) {
		/* 정수를 입력 받아 짝수인지 홀수인지 판단해서 결과를 출력하세요(복습)
		 * 짝수인 경우 "짝수" 출력, 홀수인 경우 "홀수" 출력 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();

		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		sc.close();
	}
}