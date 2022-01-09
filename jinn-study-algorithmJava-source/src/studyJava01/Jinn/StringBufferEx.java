package studyJava01.Jinn;

public class StringBufferEx {

	/* 
	 * String 객체를 + 연산을 하면 문자열이 연결되는데 기존 객체가 수정된 것이 아니라 새로운 객체가 생성되는 것이다. 
	 * 그러나 StringBuffer클래스는 객체 자체의 수정이 가능하다. 그래서  StringBuffer클래스는 동적 문자열이라고 부른다. 
	 * 동적으로 값이 수정 될수 있다는 뜻이다. 이 StringBuffer 클래스에서는 값 비교를 위해 equals()메서드를 오버라이딩 하지 않았기 때문에 
	 * 문자열 자체의 값을 비교하려면 String 클래스로 비교한 후 equals()메소드를 이용해 비교해야 한다. 
	 */
	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("abcd");
		System.out.println("문자열 연결전 sb1 = " + System.identityHashCode(sb1));
		
		sb1.append("efgh"); 
		System.out.println("문자열 연결후 sb1 = " + System.identityHashCode(sb1));
		
		System.out.println(sb1.toString().equals("abcdefgh"));
	}

}
