package studyJava08.Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx_01 {

	/*	
	 * Set인터페이스는 중복을 허용하지 않고, 저장 순서가 유지 되지 않는 컬렉션 인터페이스이다. 
	 * 구현 클래스로는 HashSet, LinkedHashSet, TreeSet이 있다. 
	 * HashSet은 저장순서를 알 수 없고 데이터도 순서대로 배치되지 않지만 LinkedHashSet은 저장 순서를 기억하고 있으면
	 * TreeSet은 데이터의 크기를 기억하는 구조이다. 
	 */
	public static void main(String[] args) {
		
		//Object타입의 배열 생성 
		Object[] arr = {"홍길동","이순신","홍길동","이순신",1,2,"1","2"} ; 
		
		//HashSet객체 생성 
		Set set = new HashSet(); 
		
		//set객체에 배열의 모든 요소 add 
		for (int i=0; i<arr.length; i++) { 
			set.add(arr[i]);
		}
		
		//출력 
		System.out.println(set);
	}
	/* 
	 * Set객체는 중복을 허용하지 않는다. 
	 * 객체의 추가된 순서와 조회되는 순서가 다르다는 것을 알 수 있다. 
	 * 출력 부분에 1과 2가 중복된 것 처럼 보이지만 하나의 숫자는 1이며, 다른하나는 문자열 1 이므로 다른객체다.
	 * 중복 객체가 아니라는것을 알아두자!!!
	 */
}
