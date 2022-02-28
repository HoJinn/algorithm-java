package studyJava11.StreamOrder;

import java.util.Arrays;
import java.util.List;

public class StreamPeek {

	/* 
	 * 스트림 반복자 
	 * 요소전체를 반복하는 메서드는 지금까지 사용했던 forEach()메서드와 peek() 메서드가 있다. 
	 * forEach()메서드는 최종 단계 반복이고, peek()메서드는 중간처리 반복자라고 하는데
	 * peek()메서드는 중간 단계에서 전체요소를 반복하면서 추가 작업을 하기 위해 사용된다. 
	 * 최종처리 메서드가 호출되어야 동작한다. 
	 */
	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(10,3); 
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1,s2,s3,s4);
		
		list.parallelStream().mapToDouble(a-> a.area())
//							 .peek(a -> System.out.println(a)); // 출력호출하는 문장이 있지만 peek()메서드는 중간 반복자 이므로 최종처리메서드가 호출되어야만 동작이 되는것이다.
							 .peek(a -> System.out.println(a)).sum(); // sum()메서드는 DoubleStream클래스에 있는 메서드로 mapToDouble()메서드에 의해 DoubleStream타입으로 변환되고 
																	  // 마지막으로 최종처리 메서드인 sum()메서드가 호출되어 각각의 요소가 출력이 된다. 
	}

}
