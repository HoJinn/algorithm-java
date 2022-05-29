package studyJava08.Collection;

import java.util.ArrayList;

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
		
		al.remove("Hello"); 
		System.out.println("1번 삭제 : " + al);
		
		al.remove(1); 
		System.out.println("2번 삭제 : " + al);
		
		al.clear(); 
		System.out.println("3번 삭제 : " + al);
		
	}

}
