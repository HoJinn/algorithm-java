package studyJava07.util;

import java.util.Arrays;

public class ArraysEx_01 {

	/* 
	 * Arrays클래스는 클래스 내에서 제공하는 static메서드 등을 이용하여 배열의 비교나, 배열의 정렬 
	 * 또는 배열의 내용을 특정 값으로 채우고자 하는 등의 일을 수행하는 클래스 이다. 
	 */
	
	// 문자열 배열 arr을 10라인에서 "임꺽정" 으로 채우고 13라인에서는 1~2번 인덱스까지 x로 채우는 예제
	public static void main(String[] args) {
		 String[] arr = { "홍길동" , "이순신" , "강감찬" , "김유신" };
		 Arrays.fill(arr, "임꺽정");
		 for (String n : arr) System.out.print(n + ",");		 
		 System.out.println();
		 Arrays.fill(arr, 1, 3, "X");
		 for (String n : arr) System.out.print(n + ",");
	}

}
