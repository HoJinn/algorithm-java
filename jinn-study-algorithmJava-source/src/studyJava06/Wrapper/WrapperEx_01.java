package studyJava06.Wrapper;

public class WrapperEx_01 {

	/* 
	 * 기본자료형을 객체화 할 수 있는 클래스를 통틀어 Wrapper클래스라 한다. 
	 * Wrapper클래스의 생성자는 매개변수로 문자열 이나 각 자료형의 값들을 인자로 받는다. 생성자가 오버로딩되어 있는 것이다. 
	 * 여러 자료형으로 다양하게 사용할 수 있다.  
	 * 
	 * 기본자료형과 Wrapper클래스 사이에는 자동 형변환이 가능하다. 이것을 우리는 박싱(Boxing),언박싱(Unboxing)이라고 부른다. 
	 * 
	 * 박싱(Boxing) : 기본자료형의 값을 Wrapper클래스로 변환하는 것 
	 * 언박싱 (Unboxing) : Wrapper클래스에 담긴 객체의 값을 기본자료형으로 변환하는 것 
	 */
		
	public static void main(String[] args) {
		
		// 정수 10이 Integer클래스 객체로 변환 (boxing) 
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println("i1==i2 : " + (i1==i2));		//false
		System.out.println("i1.equals(i2) : " + (i1.equals(i2))); // true
		System.out.println("i1.toString() : " + i1.toString()); // 10 
		
		//i1객체가 100 정수로 변환 (unboxing) 
		System.out.println("i1==10 : " + (i1==10)); // true
		int i3 = 10; 
		System.out.println("i1==i3 : " + (i1==i3)); // true
		
	}
	/* 
	 * i1 과 i2는 Integer 클래스의 객체이므로 == 비교를 하면 false가 출력된다. 
	 * Wrapper클래스들은 모두 equals() 메서드가 오버라이딩 되어 있기 때문에 주소값 비교가 아닌 객체가 가지고 있는 값을 비교한다. 
	 * toString()도 오버라이딩되어 있어서 객체가 가지고 있는 값을 문자열로 변환하여 리턴한다. 
	 */
}
