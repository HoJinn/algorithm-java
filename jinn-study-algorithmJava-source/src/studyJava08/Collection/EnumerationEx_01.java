package studyJava08.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationEx_01 {

	/* 
	 * Eunmeration은 Iterator 인터페이스의 구버전으로 Collection 프레임워크 이전에 사용했던 인터페이스
	 * 이므로, Vector,Hashtable클래스의 객체만 Enumeration객체로 변환이 가능하다. 
	 * 
	 *  이번 예제는 Vector객체를 생성해서 1~5까지 추가한뒤 Eunmeration객체와 Iterator객체로 출력하는 예제이다. 
	 */
	public static void main(String[] args) {
		 
		Vector v = new Vector(); 
		for (int i=1; i<=5; i++) { 
			v.add(i);
		}
		
		// Enumeration으로 출력하기 
		Enumeration e = v.elements();
		System.out.println("Enumeration 출력");
		while(e.hasMoreElements()) { 
			System.out.println(e.nextElement());
		}
		
		// Iterator으로 출력하기
		Iterator it = v.iterator();
		System.out.println("Iterator 출력");
		while(it.hasNext()) { 
			System.out.println(it.next());
		}
	}
	/*
	 * Collection프레임워크가 나오기전 클래스들은 약간 다른 방식으로 요소들을 처리했었는데, Collection 
	 * 인터페이스가 추가되고 이 인터페이스의 하위 클래스로 포함되면서 기본방식과 Collection 인터페이스 방식이
	 * 공존하는 형태로 사용이 가능하다. 
	 * 
	 * 기존소스를 사용하던 곳이라도 코드의 변경으로 인한 문제없이 구동시키기 위함이다. 
	 * 객체지향프로그래밍의 특징중의 하나이다. 
	 */

}
