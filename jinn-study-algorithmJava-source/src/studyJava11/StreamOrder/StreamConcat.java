package studyJava11.StreamOrder;

import java.util.stream.Stream;

public class StreamConcat {
	
	/* 
	 * Stream.concat() 
	 * 두개의 스트림 객체를 연결해 새로운 스트림 객체를 생성할 수 있다. 
	 * concatenate는 연결하다,이어지다 라는 뜻을 가진 단어로 줄여서 concat이라고 이름으로 사용 된다. 
	 */
	public static void main(String[] args) {
		
		//문자열 스트림 객체
		Stream<String> stream1 = Stream.of("홍길동","유관순","김유신");
		
		//정수 스트림 객체 
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
		
		// concat() 메서드로 두 스트림 객체 
		Stream<Object> concat = Stream.concat(stream1, stream2);
		concat.forEach(a -> System.out.print(a + ", "));
				
	
	}

}
