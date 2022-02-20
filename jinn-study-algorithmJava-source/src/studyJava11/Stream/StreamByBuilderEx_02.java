package studyJava11.Stream;

import java.util.stream.Stream;

public class StreamByBuilderEx_02 {

	/*
	 * 2. generate() 메서드 
	 * generate() 메서드를 이용하면 Supplier<T> 람다 인터페이스를 이용하여 값을 넣을 수 있다. 
	 * generate() 메서드를 사용하여 생성되는 스트림은 크기가 정해져있지 않고 무한하기 때문에 limit()메서드를 이용하여 
	 * 최대 크기를 제한해야 한다. 그렇지 않으면 무한반복 출력 되게 된다. 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// generate() 메서드 Stream객체 생성
		// 리미트 10개 생성 
		Stream<String> stream = Stream.generate(() -> "애국가").limit(10); 
		
		// 내부 반복자로 출력
		stream.forEach(s -> System.out.println(s));
	}

}
