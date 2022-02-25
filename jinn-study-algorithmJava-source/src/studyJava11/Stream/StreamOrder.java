package studyJava11.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
	
	/*
	 * 정렬(sorting) 
	 * 스트림의 중간 단계에서 sorted메서드를 이용하여 순서를 변경 할 수 있다. 
	 * 일반적인 객체를 정렬하기 위해서는 Comparable인터페이스를 구현한 클래스의 객체만 정렬이 가능하다.  
	 */
public class StreamOrder {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동","김유신","이순신","유관순"); 
		
		System.out.println("기본 정렬");
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		System.out.println("역순 정렬");
		list.stream().sorted(Comparator.reverseOrder())
					 .forEach(System.out::println);
	}

}
