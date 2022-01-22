package studyJava08.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListEx_03 {
	
	/*
	 * Shape클래스는 abstract 추상클래스이다. abStract메서드를 포함하고 있기 때문에 클래스도 추상클래스로 선언해야 한다. 
	 * 이 추상 클래스 Shape를 상속 받고 있는 Circle과 Rectangle클래스는 부모(상위)클래스인 Shape의 추상메서드를 반드시 재정의 해야하며 
	 * Circle은 우너의 면적과 둘레를 구하는 기능을, Rectangle은 사각형의 면적과 둘레를 구하는 기능으로 재정의 했다. 
	 * 생성자를 통해 반지름,넓이 높이 값을 각 클래스의 필드에 값을 넣어주는 생성자를 정의하고 있다.  
	 */

	public static void main(String[] args) {
		
		List list = new ArrayList(); 
		//list 객체에 요소 추자 
		list.add(new Circle(3.0));
		list.add(new Rectangle(3,4));
		list.add(new Circle(5));
		list.add(new Rectangle(5,6));
		
		System.out.println("전체 도형의 면적의 합 : " + getArea(list));
		System.out.println("전체 도형의 둘레의 합 : " + getLength(list));
		
	}
	
	public static double getLength(List list) { 
		double value = 0;
		
		for(int i=0; i<list.size(); i++) {
			// list 객체 형변환 
			Shape s = (Shape)list.get(i);
			value += s.length();
			
		}
		return value;
	}
	private static double getArea(List list) { 
		double value = 0;
		
		for (int i =0; i<list.size(); i++) { 
			//list 객체 형변환과 메서드 호출 동시에
			value += ((Shape)list.get(i)).area();
		}
		return value;
	}

}
