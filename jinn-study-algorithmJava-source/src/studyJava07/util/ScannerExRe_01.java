package studyJava07.util;

import java.util.Scanner;

public class ScannerExRe_01 {
	
	/*
	 * Scanner클래스에 대해 다시 복습해보자. 
	 * Scanner클래스는 화면이나 파일,문자열 등 입력으로부터 문자를 읽어주는 클래스이다. 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int cnt = 0; 
		while (true) { 
			System.out.println("이름을 입력하세요");
			String name = scan.nextLine(); 
			if ("".equals(name)) break;
			System.out.println(name+"님 안녕하세요. ");
			cnt++;	//while문이 끝나면 반복하면서 cnt에 1씩 증가했던 변수를 출력한다. 
		} 
		System.out.println("총 입력된 회원수 : " +cnt);
	}
	/* 
	 * while문 안에서 "이름을 입력하세요" 라고 출력하고 사용자가 입력할때까지 대기한다. 
	 * 콜솔창을 클릭하면 입력할 수 있게 되고 입력하고 엔터를 치면 "000님 안녕하세요" 라고 출력 후 다시while문을 반복한다. 
	 * 빈 물자열이면 break로 종료된다. 
	 */
}