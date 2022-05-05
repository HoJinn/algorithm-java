package studyJava07.util;

import java.util.Scanner;

public class ScannerExRe_02 {

	/* 
	 * Scanner기본 예제 사용자 변수받기 한번 더 복습해보자.
	 */
		public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);// console로 부터 데이터를 입력받는 자원
        
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        
        System.out.print("num1 입력 : ");
        num1 = scanner.nextInt();// 사용자로부터 입력 scanner사용, nextInt()
        System.out.println("num1의 입력받은 값: "+ num1);
        
        System.out.print("num2 입력 : ");
        num2 = scanner.nextInt();
        System.out.println("num2의 입력받은 값: " + num2);
        
        result = num1 + num2;
        System.out.println("result : " + result);
        
        scanner.close();// 리소스를 닫아주는 코드 
        
 
    }
 
}