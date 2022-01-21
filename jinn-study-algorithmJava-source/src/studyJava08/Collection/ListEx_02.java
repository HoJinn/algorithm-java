package studyJava08.Collection;

import java.util.Vector;

public class ListEx_02 {
	
	/* 
	 * List 구현 클래스인 Vector에 대해 살펴보자. 
	 * Vector 클래스는 Collection프레임워크 이전에 사용 되었던 클래스다. 
	 */
	public static void main(String[] args) {
	
		Vector list = new Vector(); 
		list.add(1.2); // List메서드 
		list.add(Math.PI); // List메서드 
		list.addElement(3.4); // 이전 메서드 
		
		// 향상된 for문 
		for (Object o : list) { 
			System.out.println(o);
		}
		double num = 3.4; 
		
		// 해당 요소의 인덱스 (없으면 -1)
		int index = list.indexOf(num);
		if (index >= 0) {	//요소가 존재함 
			System.out.println(num + " 의 위치 : " + index);
		} else { //존재하지 않음 
			System.out.println(num + " 는 list에 없습니다.");
		}
		num = 1.2;
		// 값이 존재하는지 확인 
		if (list.contains(num)) { 
			//제거(이전 메서드) 
			list.removeElement(num);
			System.out.println(num + " 삭제됨");
		}
		// 해당 요소의 인덱스 (없으면 -1) 
		System.out.println(list.indexOf(num));
		System.out.println(list); // toString() 
	}
	/* 
	 * Vector클래스는 Collection프레임워크가 나오기 전부터 있던 클래스 이기 때문에 Collection 인터페이스에 정의된 
	 * 정형화된 메서드 외에 이미 존재 하던 메서드가 있기 때문에 addElement()메서드가 add()메서드와 동일한 기능을 하는것. 
	 */
}
