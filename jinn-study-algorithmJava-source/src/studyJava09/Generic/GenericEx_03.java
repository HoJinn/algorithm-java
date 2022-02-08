package studyJava09.Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericEx_03 {
	
		/* 
		 * 이번에는 ArrayList의 제네릭 타입으로 HashMap을 지정해보는 예제를 만들어 보자 
		 */
	public static void main(String[] args) {
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> hm = new HashMap<String,Object>();
		hm.put("name", "홍길동"); 
		hm.put("id", "hong"); 
		hm.put("age", 30);
		list.add(hm); 
		
		hm = new HashMap<String, Object>();
		hm.put("name", "이순신");
		hm.put("id", "lee"); 
		hm.put("age", 40); 
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "김유신"); 
		hm.put("id", "kim"); 
		hm.put("age", 50); 
		list.add(hm);
		
		
		for(int i=0; i<list.size(); i++) { 
			System.out.println("인덱스 : " + i + ", 이름 : " + list.get(i).get("name")
								+ ", 아이디 : " + list.get(i).get("id") 
								+ ", 나이 : " + list.get(i).get("age"));
		}
	}
	/*
	 * 제네릭이 중첩 되어 있는 구조로 List의 제네릭타입으로 Map이 Map의 제네릭타입으로 String,Object로 정의 되어 있다. 
	 * 제네릭 안에 제네릭이 있는것이다. 
	 */
	
	
}
