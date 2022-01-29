package studyJava08.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterVSsizeEx_01 {

	/* 
	 * Iterator 객체를 사용해서 List객체의 모든 요소들을 차례대로 하나씩 출력하거나 처리할 수 있는데, 
	 * 앞 예제중에서 봤지만 for문을 통해 size() 메서드를 이용해 인덱스로 처리하는 방법이 있다. 
	 * 
	 * 둘 다 완전히 동일한 결과를 나타내는데, 이왕이면 size()메서드를 이용하는 것이 속도면에서 약간빠르다. 
	 */
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); 
		
		for (int i=0; i<100000000; i++) { 
			list.add(i);
		}
		
		// Iterator 실행시간 
		long start = System.currentTimeMillis(); 
		Iterator it = list.iterator(); 
		while (it.hasNext()) { 
			it.next(); 
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Iterator 소요 시간 : " + (end-start));

		//size 실행시간 
		start = System.currentTimeMillis();
		for (int i=0; i<list.size(); i++) { 
			list.get(i);
		}
		end = System.currentTimeMillis(); 
		System.out.println("size() 소요 시간 : " +(end-start));
	}

	/* 
	 * 작은 차이도 시스템에서 다양한 환경이나 사용자에 따라 점점 큰 차이로 변할수 있다. 
	 * 같은 상황이라면 size()메서드를 통해 인덱스로 접근하는 방식을 사용하는게 좋다.  
	 * 
	 * Iterator의 장점 
	 * 1. 모든 컬렉션 프레임 워크에 공통적으로 사용할수 있다. 
	 * 2. 사용하기 쉽고 인덱스 처리없이 쉽게 데이터에 접근할수 있다. 
	 * 
	 * Iterator의 단점 
	 * 1. 대량의 데이터를 처리할 때 속도가 느려지는 문제가 있다. 
	 * 2. 앞에서 부터 단방향으로만 반복이 가능하며, 값을 변경하거나 추가 할수 없다. 
	 */
}
