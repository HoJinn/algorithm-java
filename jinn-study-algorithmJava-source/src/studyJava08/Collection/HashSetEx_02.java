package studyJava08.Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx_02 {
	
	/*
	 * 사용자가 정의한 클래스 객체의 중복 여부 확인하기. 
	 */
	public static void main(String[] args) {
		
		// HashSet 객체 생성 
		Set set = new HashSet(); 
		
		// 문자열 객체 두개 추가 
		set.add(new String("abc")); 
		set.add(new String("abc")); 
		
		// Member 객체 두개 추가(사용자 정의 클래스) 
		set.add(new Member("홍길동", 40));
		set.add(new Member("홍길동", 40));
		
		// 출력
		System.out.println(set);
		
	}
	/* 
	 * Member 클래스에서 equals()메서드는 각 필드의 값까지 다 비교하는 형태로 
	 * 재정의하고, hashCode()메서드는 name과 age필드를 더했는데, int타입으로 
	 * 리턴해야 하기 때문에 name을 해쉬코드로 변환해서 연산해보았다.
	 * Member객체도 역시 중복으로 인식되어 한 개만 저장되는것을 알 수 있다.
	 */
}
