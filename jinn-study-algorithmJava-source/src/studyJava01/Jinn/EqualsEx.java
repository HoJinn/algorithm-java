package studyJava01.Jinn;

public class EqualsEx {

	/* 
	 * Equals 메서드는 주로 객체를 비교하여 결과값을 boolean값으로 리턴하는 역할을 한다. 
	 * 아래 코드는 실제 Object클래스에 정의되어 있는 equals()메서드 이다. 
	 * 		public boolean equals(Object obj){ 
	 * 			return (this == obj);
	 */
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if (str1 == str2) { 
			System.out.println("str1 객체와 str2 객체는 같음");
		} else { 
			System.out.println("str1 객체와 str2 객체는 다름");
		}
		
		if (str1.equals(str2)) {
			System.out.println("str1 문자열과 str2 문자열은 같음");
		} else { 
			System.out.println("str1 문자열과 str2 문자열은 다름");
		}
	}
}
