package studyJava11.Stream;

import java.util.Arrays;

public class ArrayToStreamEx_02 {
	
	/* 
	 * 이번에도 배열을 문자열(String)로 변환하는 공부를 해보자. 
	 * 
	 * 배열을 문자열로 변환하는 방법 
	 * Arrays.toString()
	 * 
	 * char 배열을 문자열로 변환하는 방법 
	 * String.valueOf() 
	 * 
	 * 문자열을 char로 변환하는 방법 
	 * .toCharArray() 
	 */
	public static void main(String[] args) {
		
		char[] charArray1 = {'a','b','c'};
		char[] charArray2; 
		int[] intArray1 = {1,2,3};
		
		//char 배열을 String으로 변환 
		String str1 = String.valueOf(charArray1);
		String str2 = new String(charArray1); 
		
		//Arrays.toString() "[배열요소, 배열요소, ...]" 형태 문자열 변환 
		String str3 = Arrays.toString(intArray1); 
		
		//String 문자열을 char 배열로 변환 
		charArray2 = str1.toCharArray();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//배열을 문자열로 변환해서 출력 
		System.out.println(Arrays.toString(charArray1));
		
		System.out.print("charArray2 : ");
		
		for(int i=0; i<charArray2.length; i++) { 
			System.out.print(charArray2[i] + "");
			
		}
	}
}
