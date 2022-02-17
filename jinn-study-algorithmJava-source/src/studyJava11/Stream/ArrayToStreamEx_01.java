package studyJava11.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStreamEx_01 {

	/*
	 * 배열은 Array.stream()메소드를 이용하여 스트림 객체로 생성한다. 
	 * 배열을 이용한 스트림을 생성해보자 
	 */
	public static void main(String[] args) {
		
		// 문자열 배열 객체 생성
		String[] arr = new String[] {"a", "b", "c", "d", "e", "f"} ;
		
		// 배열전체 Stream 객체로 변환 
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		// 인덱스 지정해서 변환(2부터 5전까지) 
		// 두번째 인덱스는 포함되지 않는다. 
		Stream<String> stream2 = Arrays.stream(arr, 2, 5);
		stream2.forEach(s -> System.out.print(s+" "));
		
	}

}
