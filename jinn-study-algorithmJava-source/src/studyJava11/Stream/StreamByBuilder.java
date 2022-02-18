package studyJava11.Stream;

import java.util.stream.Stream;

public class StreamByBuilder {
	
	/*
	 * 메서드를 이용하여 스트림 생성하기 
	 * 
	 * 1. build()메서드 
	 * 
	 */
	public static void main(String[] args) {
		
		// builder() 메서드로 Builder 객체 생성
		// add() 메서드도 리턴타입이 Builder 객체 이므로 메서드 체이닝 가능 
		Stream stream = Stream.builder()
					.add("무궁화")
					.add("삼천리")
					.add("화려강산")
					.add("대한사람")
					.build();
		//build()메서드로 Stream객체 생성
					
		//내부 반복자로 출력
		stream.forEach(s -> System.out.println(s+" "));
			
	}

}
