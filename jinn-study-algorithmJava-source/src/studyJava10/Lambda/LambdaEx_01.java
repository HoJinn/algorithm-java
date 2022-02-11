package studyJava10.Lambda;

public class LambdaEx_01 {
	/* 
	 * 람다식은 이름이 없는 익명 함수형태로, 자바에서는 함수라는 용어를 사용하지 않지만, 
	 * 함수적 인터페이스를 자료형으로 사용한다. 
	 * 함수적 인터페이스는 추상 메서드가 한 개만 존재하는 인터페이스를 말한다. 
	 * 또한 람다식이 인터페이스에 대입되는 구조이다. 인터페이스는 직접 객체를 생성할 수 없고 구현 클래스로만 객체를 생성할 수 있는데 
	 * 이 람다식이 구현 클래스의 객체를 생성하는 역할을 하는 것이다. 
	 * 
	 *  
	 * Runnable 인터페이스를 이용하여 람다식으로 스레드를 생성하는 예제를 만들어보자.
	 */
	public static void main(String[] args) {
	
		System.out.println("시작");
		Runnable run = () -> { 			// Runnable은 하나의 추상메서드(run)를 갖고있는 인터페이스
			for (int i=1; i<=10; i++) { 
				System.out.println("첫번째 : " + i);
			}
		};
		
		Runnable run2 = () -> { 		// Runnable은 하나의 추상메서드(run2)를 갖고있는 인터페이스
			for (int i=1; i<10; i++) { 
				System.out.println("두번째 : " + i);
			}
		}; 
		
		Thread t = new Thread(run); 
		Thread t2 = new Thread(run2);
		
		t.start();
		t2.start();
		System.out.println("종료");
		
	} 
	/*
	 * Runnable 인터페이스는 하나의 추상메서드만 가져야한다. 
	 * 만약 람다식으로 사용될 인터페이스를 만들 때 두 개 이상의 추상 메서드를 선언하지 못하도록
	 * 하려면 @Functionallnterface 라는 어노테이션을 넣어주면 컴파일러가 추상메서드가 두 개이상 정의된 경우 에러를 내개 된다. 
	 */
}
