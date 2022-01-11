package studyJava04.overridingEx;

public class TaxiMain {

	/* Car 클래스를 상속 받는 Taxi클래스를 생성하고 Taxi클래스에서 go() 메서드를 재정의를 한 예제 
	 * Taxi클래스를 객체로 생성해서 go() 메서드를 실행한 것이다. 
	 * 재정의된 메서드가 우선 적용되어, Taxi 클래스에서 재정의된 go() 메서드의 "미터기를 켜고 전진한다" 내용출력
	 */
	
	public static void main(String[] args) {
		
		Taxi t = new Taxi(); 
		t.go();
		
		
	}
}
