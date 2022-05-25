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
		
		al.set(1, "World"); 
		
		System.out.println("변경된 값 : " + al);
	}

}
