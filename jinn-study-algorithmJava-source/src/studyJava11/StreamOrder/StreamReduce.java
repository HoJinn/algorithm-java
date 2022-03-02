package studyJava11.StreamOrder;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

	/* 
	 * 사용자 집계 메서드
	 * 스트림에서 기본적으로 제공되는 집계 메서드 외에 사용자가 다양한 집계 결과물을 생성할 후 있는 
	 * reduce()메서드가 제공된다. 	 
	 *
	 */
	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(10,3); 
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1,s2,s3,s4);
		
		double areaSum = list.stream().mapToDouble(Shape::area).sum(); 
		System.out.println("sum() 를 이용한 면접 합계 : " + areaSum);
		areaSum = list.stream().mapToDouble(Shape::area)
							   .reduce((a,b) -> a+b).getAsDouble();
		System.out.println("reduce(Operator)를 이용한 면접 합계 : " + areaSum);
		
		areaSum = list.stream().mapToDouble(Shape::area)
							   .reduce(0, (a,b) -> a+b);
		System.out.println("reduce(0,Operator)를 이용한 면적 합계 : " + areaSum);
							   
	}

}
