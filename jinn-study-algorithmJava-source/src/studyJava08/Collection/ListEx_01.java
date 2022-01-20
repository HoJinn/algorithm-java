package studyJava08.Collection;

import java.util.ArrayList;
import java.util.List;

	/* 
	 * List객체는 배열과 유사하며, 길이를 자유롭게 변경할 수 있는 객체이다. 추가된 순서를 유지하고, 중복해서 객체를 저장할 수 있다. 
	 * 저장하는 순서를 유지하기 때문에 인덱스를 통해 원하는 객체를 직접 검색할 수 있는 기능이 있다. 
	 * 
	 * ArrayList는 데이터를 연속적으로 순서대로 저장하기 때문에 접근 속도는 빠르지만 
	 * 중간에 있는 데이터를 삭제하거나 삽입할 떄 속도가 LinkedList보다는 느라다. 
	 * 
	 */
public class ListEx_01 {

	public static void main(String[] args) {
		List list = new ArrayList();	
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		 
		for (int i=0; i<list.size(); i++) { 		// size()메서드는 리스트의 길이를 나타내므로 i<7 이 된다. 
			System.out.println(i+":"+list.get(i));
		}
	}
}
