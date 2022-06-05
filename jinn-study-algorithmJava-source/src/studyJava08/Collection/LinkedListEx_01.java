package studyJava08.Collection;

import java.util.LinkedList;

	/* 
	 * LinkedList란? 
	 * LinkedList란 collection 프레임워크의 일부이며 java.util 패키지에 소속되어 있습니다. 
	 * 이 클래ㅑ스는 데이터가 연속된 위치에 저장되지 않고 모든 데이터가 ㄷ이터 부분과 주소 부분을 별 도로 가지고 있습니다. 
	 * 
	 * 데이터는 포인터와 주소를 사용하여 연결합니다. 
	 */
public class LinkedListEx_01 {
	public static void main(String[] args) { 
		LinkedList<String>ll = new LinkedList<String>();

		//LinkedList값을 추가하기 [add(), add(Object)  
		ll.add("Hello"); 
		ll.add("Hello"); 
		ll.add(1, "World"); 
		System.out.println(ll);
		
		
	}

}
