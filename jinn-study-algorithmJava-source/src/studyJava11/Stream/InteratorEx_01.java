package studyJava11.Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InteratorEx_01 {

	/*
	 * 스트림(Stream) 
	 * 스트림(Stream)은 jdk8 버전 이후에 추가된 API 다. 
	 * 
	 *  스트림 이전에는 배열이나 Collection 객체를 다루기 위해서는 for구문을 이용하여 하나씩 꺼내서 다루는 방식이 사용되었는데 
	 *  처리해야될 데이터가 많거나, 데이터가 복잡해 질수록 코드의 양은 많아지고 시간도 많이 걸리게 된다. 
	 *  
	 *  스트림에서는 람다(함수형 인터페이스)를 활용하여 내부반복자를 이용하므로써 시간과 코드의 양을 줄일 수 있다. 
	 *  또한 스트림으로 처리시 간단하게 병렬처리(multi threading)가 가능하다.
	 *  
	 *  하나의 작업을 둘 이상의 작업으로 잘게 나눠서 동시에 진행하는 것을 병렬처리(parallel processing) 라고 한다. 
	 *  즉, 스트림을 이용해 대용량의 데이터들을 빠르게 처리할수 있다. 
	 * 
	 *  스트림의 3단계 처리단계 
	 *  1. 생성하기 : 스트림 인스턴스 생성
	 *  2. 가공하기 : 필터링(filtering) 및 매핑(mapping) 등 원하는 결과를 만들어 가는 중간작업 
	 *  3. 결과 만들기 : 최종적으로 결과를 만들어내는 작업.
	 *  
	 *  외부반복자 와 내부반복자
	 *  외부반복자 : 컬렉션내의 요소를 반복문을 통해서 하나씩 읽어 처리하는 방식
	 *  내부반복자 : 스트림의 forEach메서드에 람다식으로 기술하는 방식 
	 *  
	 *   외부반복자와 내부반복자를 예제를 통해 알아보자.
	 */
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(new String[] {"홍길동","김유신","이순신","유관순"});
		
		System.out.println("for문 이용");
		for (int i=0; i<list.size();i++) { 
			System.out.println(list.get(i));
		}
		System.out.println("외부 반복자 이용");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("내부 반복자 이용");
		list.stream().forEach(s-> System.out.println(s));
	}
	/* 
	 * 람다식을 이용하면 여러줄로 코딩했던 부분을 한 줄로 간단하게 표현할 수 있게 된다. 
	 */
}
