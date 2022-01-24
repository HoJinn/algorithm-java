package studyJava08.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
	/*
	 * 이번 예제는 데이터를 중간에 추가하는 경우의 성능차이를 확인해보자.
	 */
public class ArrayListCompareLinkedListEx_02 {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList(); 
		LinkedList llist = new LinkedList();
		
		for (int i=0; i<100000; i++) { 
			alist.add(i);
			llist.add(i);
		}
		System.out.println("ArrayList추가");
		long start = System.currentTimeMillis();
		for (int i=0; i<10000; i++) { 
			alist.add(500,i);	//500번 인덱스에 값을 추가하는 경우 객체를 복사해서 처리하기 때문에 LinkedList에 비해 성능이 현저히 떨어진다. 
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		System.out.println("LinkedList 추가");
		start = System.currentTimeMillis(); 
		for (int i=0; i<10000; i++) {
			llist.add(500, i); 
		}
		end =System.currentTimeMillis();
		System.out.println(end-start);
	}
	/* 
	 * 보통 데이터베이스의 데이터를 조회 처리하는 경우 데이터를 중간에 추가/삭제하는 경우 보다 
	 * 데이터에 접근해서 출력하거나 연산하는 경우가 많으므로 ArrayList를 조금 더 자주 사용하게 된다. 
	 * 
	 */
}
