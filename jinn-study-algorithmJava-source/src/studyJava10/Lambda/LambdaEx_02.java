package studyJava10.Lambda;

public class LambdaEx_02 {

	/* 
	 * 이번엔 매개변수가 하나이며, 리턴값이 없는 람다식예제를 만들어보자.
	 */
	public static void main(String[] args) {
		
		LambdaInterface3 li3 = (String name) -> { 		// 추상메서드 print(String name) 재정의 
			System.out.println("제 이름은 " +name+ "입니다.");
		};
		li3.print("홍길동");
	}

	/* 
	 * 매개변수가 하나인 람다식은 자료형 String을 생략할 수 있고, 괄호도 생략할 수 있다. 
	 * 또한 실행문이 한 줄일 때는 중괄호도 생략할 수 있다.
	 */
}
	@FunctionalInterface  // 함수형 인터페이스는 1개의 추상메서드를 갖고 있는 인터페이스 
		interface LambdaInterface3 {
		void print(String name);
	}
	
	/* 
	 * 함수형 인터페이스를 사용하는 이유 
	 * 람다식으로 만든 객체에 접근하기 위해서 이며 위 예제처럼 람다식을 사용할 때마다 함수형 인터페이스를 매번 정의
	 * 하기에는 불편하기 때문에 자바에서 라이브러리로 제공을 해준다. 
	 */