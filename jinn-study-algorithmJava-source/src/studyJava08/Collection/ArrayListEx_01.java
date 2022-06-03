package studyJava08.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx_01 {
	/* 
	 * ArrayList 값을 추가해보자. 
	 * 
	 * ArrayList의 값 추가하기 위해 add()메서드를 사용합니다. 
	 * 
	 * add(Object): ArrayList의 마지막에 데이터를 추가합니다. 
	 * add(int index,Object) : ArrayList의 index에 데이터를 추가합니다. 
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Hello"); 
		al.add("Hello"); 
		al.add(1,"World"); 
		
		//값 변경하기 
		System.out.println("초기값" + al);
		
//		al.set(1, "World");//변경하기  
		
//		System.out.println("변경된 값 : " + al);
		
		//값 삭제하기 
		/* 
		 * clear(): ArrayList의 모든 값을 삭제할 때 사용 된다. 
		 * remove() : 값을 하나씩 제거할때 사용한다. 
		 */
//		al.remove("Hello"); 
//		System.out.println("1번 삭제 : " + al);
//		
//		al.remove(1); 
//		System.out.println("2번 삭제 : " + al);
//		
//		al.clear(); 
//		System.out.println("3번 삭제 : " + al);

		//ArrayList 크기 구하기 
		//ArrayList의 크기를 구하는 방법은 size()메서드를 사용하여 구할수 있습니다. 
//		System.out.println("ArrayList의 크기 : " + al.size());
		
		//ArrayList 값 출력하기 
		//ArrayList의 결과를 출력하는 방법에는 get(int Index)메서드가 있습니다. 
		//전부 출력하고 싶다면 for문과 향상된for문을 사용하여 출력을 할 수 있습니다. (Iterator를 사용하여 출력을 할수도 있다.) 
		
		for (int i=0; i<al.size(); i++) { 
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		for (String str : al) 
			System.out.print(str + " ");
		
		System.out.println();
		
		Iterator iter = al.iterator(); 
		while(iter.hasNext()) { 
			System.out.print(iter.next()+ " ");
		}
	}
}
