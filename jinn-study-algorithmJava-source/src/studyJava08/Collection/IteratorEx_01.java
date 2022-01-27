package studyJava08.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx_01 {

	/* 
	 * Iterator는 Collection 프레임워크 객체에 저장된 데이터를 접근하는데 사용되는 인터페이스이다.
	 * 모든 Collection 객체는 Interator객체로 변환이 가능하다. 자료 구조에 포함된 데이터의 모양에
	 * 상관없이 다음 데이터를 접근할 수 있도록 만들어주는 포인터로 유사한 개념으로 데이터베이스에는 cursor라는 개념이 존재한다. 
	 */
	public static void main(String[] args) {
	
		//Iterator 객체 선언 
		Iterator it = null; 
		
		// list객체와 Set객체 생성 
		List list = new ArrayList(); 
		Set set = new HashSet();
		
		// list와 set에 5개의 값 추가 
		for (int i=1; i<=5; i++) { 
			list.add(i); 
			set.add(i+5);
		}
		
		//출력 
		System.out.println(list);
		System.out.println(set);
		
		//list에서 Iterator객체로 생성 
		it = list.iterator(); 
		
		// list의 Iterator객체 출력 
		System.out.println("List Iterator 출력");
		iteratorPrint(it);
		
		// set에서 Iterator객체로 생성 
		it = set.iterator();
		
		// set의 Iterator객체 출력
		System.out.println("Set Iterator 출력");
		iteratorPrint(it);
		
		// 출력 
		System.out.println(list);
		System.out.println(set);
		
	}
	private static void iteratorPrint(Iterator it){
		// Iterator 객체 반복 (다음 요소가 있으면 반복) 
		while (it.hasNext()) { 
			// Iterator객체의 다음 요소 읽어와서 출력
			System.out.println(it.next());
			// 현재 요소 삭제 
			it.remove();
		}
	}
	/* 
	 * List와 Set객체를 각각 생성해 Iterator객체로 변환해서 iteratorPrint()메서드를 통해 모든 요소들을 출력하는 예제이다. 
	 * 출력 후 요소를 삭제했기 때문에 출력문에서는 빈 Collection으로 출력 되었다. 
	 */
}
