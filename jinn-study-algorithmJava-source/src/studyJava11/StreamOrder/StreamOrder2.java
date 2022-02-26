package studyJava11.StreamOrder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder2 {

	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(10,3); 
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1,s2,s3,s4);
		
		System.out.println("오름차순 정렬");
		list.stream().sorted().forEach(System .out::println);
		
		System.out.println("내림차순 정렬1");
		list.stream().sorted((a,b) -> b.compareTo(a)-a.compareTo(b))
					 .forEach(System .out::println);
		
		System.out.println("내림차순 정렬2");
		list.stream().sorted(Comparator.reverseOrder())
					 .forEach(System.out::println);
	}
	/* 
	  	실행결과
	  	오름차순 정렬
		넓이 : 30.0
		넓이 : 40.0
		넓이 :314.1592653589793
		넓이 :380.132711084365
		내림차순 정렬1
		넓이 :380.132711084365
		넓이 :314.1592653589793
		넓이 : 40.0
		넓이 : 30.0
		내림차순 정렬2
		넓이 :380.132711084365
		넓이 :314.1592653589793
		넓이 : 40.0
		넓이 : 30.0
		
		실행결과를 보면 넓이 기준으로 정렬되어 출력 되고 있다. 
		내림차순으로 정렬하기 위해서 Comparator.reverseOrder()메서드를 이용하면 기본 정렬 방식의 역순으로 출력 된다. 
		Shape클래스는 Comparable 인터페이스를 구현하고 있는데, Shape클래스(부모클래스) Comparable인터페이스를 구현햇으므로 
		Shape클래스의 자식클래스인 Rectangle과 Circle클래스도 역시 Comparable인터페이스의 구현 클래스가 된다. 
		
	 */
}
