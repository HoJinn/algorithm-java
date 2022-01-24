package studyJava08.Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCompareLinkedListEx_01 {

	public static void main(String[] args) {
		
		ArrayList alist = new ArrayList(); 
		LinkedList llist = new LinkedList(); 
		
		for (int i=0; i<100000; i++) { 
			alist.add(i);
			llist.add(i);
		}
		
		System.out.println("ArrayList Access");
		long start = System.currentTimeMillis();
		for (int i=0; i<alist.size(); i++) { 
			alist.get(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		System.out.println("LinkedList Access");
		start = System.currentTimeMillis();
		for (int i=0; i<llist.size(); i++){ 
			llist.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}
	/* 
	 * 객체들을 각각 for문을 통해 get()메서드를 호출하는 코드를 시간을 측정하여 출력해봤다. 
	 * 실행결과에서 보듯 엄청난 성능 차이가 나는 것을 알 수 있다. 
	 * 데이터가 더 많아지면 성능차이는 더욱 커진다. 
	 */
}
