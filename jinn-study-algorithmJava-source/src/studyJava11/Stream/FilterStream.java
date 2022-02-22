package studyJava11.Stream;

import java.util.Arrays;
import java.util.List;

public class FilterStream {
	
	/*
	 * 필터링(filtering) 
	 * 정수기에 물을 걸러주는 것을 필터라고 하는 것처럼, Steram 내의 요소를 걸러내는 기능을 말한다. 
	 * 필터링의 주요 메서드는 중복을 제거해주는 distinct()메서드 와 filter() 메서드가 있다. 
	 * 이 두개의 메서드는 모든 Stream객체가 가지고 있는 공통 메서드 이다. 
	 * distinct는 중복을 제거하는 것이도 filter는 스트림의 각 요소를 1개씩 입력 받아서 boolean을 리턴하는 표현식을 이용해서
	 * true를 리턴하는 데이터만 모아서 새로운 스트림을 생성해서 리턴한다. 
	 */

	public static void main(String[] args) {
		
		// List 객체 생성 
		List<String> list = Arrays.asList("홍길동", "이순신", "홍길동", "이순신", "홍길동", "유관순");
		
		// distinct()메서드로 중복 제거 후 내부 반복자로 출력 
		System.out.println("distinct()");
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		
		//"홍"으로 시작하는 문자열로 필터링 후 내부 반복자로 출력 
		System.out.println("filter()");
		list.stream().filter(n-> n.startsWith("홍"))
					 .forEach(n-> System.out.println(n)); 
		System.out.println();
		
		//중복 제거 후 "홍"으로 시작하는 문자열 내부 반복자로 출력 
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(n-> n.startsWith("홍"))
								.forEach(n->System.out.println(n));
		
		
	}

}
