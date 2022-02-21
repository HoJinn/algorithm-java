package studyJava11.Stream;

import java.util.stream.Stream;

public class StreamByInteratorEx_01 {

	/* 
	 * iterate()메서드 
	 * iterate()메소드를 이용하여 스트림 내부의 요소를 만들수 잇다. 
	 * 해당 방식도 generate()메서드 방식처럼 최대 개수의 제한을 두어야 한다. 매개번수로는 초과값과 함수형 인터페이스가 
	 * 람다표현식으로 정의된다. 
	 */
	
	public static void main(String[] args) {

		// generate() 메서드로 stream객체 생성 
		// 리미트 10개 설정 
		Stream<Integer> stream = Stream.iterate(1, n -> n+1).limit(10); 
		
		// 내부반복자로 출력 
		stream.forEach( s-> System.out.println(s));
	
	}

}
