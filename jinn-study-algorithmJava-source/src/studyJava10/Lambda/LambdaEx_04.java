package studyJava10.Lambda;

public class LambdaEx_04 {
	
	/* 
	 *  람다식에서 사용되는 this 
	 *  람다식은 내부클래스의 익명 객체로 인식되므로 람다식 내부의 this는 람다 객체 자신을 의미한다. 
	 *  람다표현식 내에서 지역변수 접근 시 지역변수는 상수화도 필요하다. 
	 */
	public static void main(String[] args) {
		
		Outer o = new Outer(); 
		o.method();
		
	}
}

@FunctionalInterface
interface LambdaInterface5 { 
	void method(); 
	
}

class Outer { 
	public int iv = 10; 
	void method() { 
		final int iv = 40;
		LambdaInterface5 f5 = () -> { 
			System.out.println("Outer.this.iv : " + Outer.this.iv);
			System.out.println("this.iv : " + this.iv);
			System.out.println("iv : " + iv);
		};
		f5.method();
	}
	/* 
	 * 자바 표준 API 에서 한 개의 추상 메서드를 가진 인터페이스들은 모두 람다식을 사용할 수 있다. 
	 * 람다에 사용되는 함수적인터페이스를 java.util.function패키지에 설정하여 사용하고 있다. 
	 */
	
}