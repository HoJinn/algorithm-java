package studyJava00.Test;

import java.util.Arrays;

public class excercuseArr03 {

	// 문자열 배열 arr을 10라인에서 "타요"로 채우고 13라인에서는 1~2번 인덱스까지 x로 채우는 예제를 만들어보자.
		public static void main(String[] args) {
			 String[] arr = { "홍길동" , "이순신" , "강감찬" , "김유신" };
			 Arrays.fill(arr, "타요");
			 for (String n : arr) System.out.print(n + ",");		 
			 System.out.println();
			 Arrays.fill(arr, 1, 3, "X");
			 for (String n : arr) System.out.print(n + ",");
		}

	}