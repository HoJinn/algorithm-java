package studyJava01.Jinn;

public class HashCodeEx {

	public static void main(String[] args) {
		
		String str1 = new String ("abc"); 
		String str2 = new String ("abc"); 
		System.out.println("str1.hashCode() : " + str1.hashCode());
		System.out.println("str2.hashCode() : " + str2.hashCode());
		System.out.println("System.identityHashCode(str1):" + System.identityHashCode(str1));
		System.out.println("System.identityHashCode(str2):" + System.identityHashCode(str2));
	}
	/* 
	 * String 클래스의 hashCode()메서드는 문자열 값이 같으면, 동일한 해쉬코드를 리턴하도록 재정의 되어 있기 때문에 
	 * 문자열 값이 같으면 str1 과 str2에 대한 hashCode()메서드를 실행하면 항상 동일한 해쉬코드 값을 리턴한다. 
	 * 
	 * System.identityHashCode() 메서드는 Object클래스의 HashCode()메서드처럼 객체의 주소값으로 해쉬코드를 생성한다. 
	 * 모든 객체에 대해 항상 다른 해쉬코드값을 리턴한다.
	 * 
	 * 이클립스에서 프로그램을 실행할때마가 해쉬코드 값이 다르게 출력된다. 
	 * str1 과 str2변수가 해쉬코드는 같지만 서로 다른 객체인 것이다. 
	 */
	
}
