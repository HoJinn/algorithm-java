package studyJava08.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx_02 {

	/* 
	 * 다음으로 키 값들만 조회하는 예제를 만들어 보자 
	 */
	public static void main(String[] args) {
		// Map 객체 생성 
		Map map = new HashMap(); 
		
		// 이름이 담긴 문자열 배열 생성 
		String[] names = { "홍길동", "김유신", "이순신", "강감찬" ,"김유신"} ; 
		// 숫자가 담긴 정수 배열 생성 
		int[] nums = {1234,4567,2350,9870,2345};
		
		//Map 객체에 두 배열의 값들을 키와 밸류 쌍으로 저장 
		for (int i=0; i<names.length; i++) { 
			map.put(names[i], nums[i]);
		}
		
		//Map 객체에서 key들만 조회하기 
		Set<String> keys = map.keySet();
		for(String key : keys) { 
			System.out.println(key + "=" + map.get(key));
		}
		System.out.println("Iterator로 출력");
		Iterator it = keys.iterator();
		while (it.hasNext()) { 
			String a = (String)it.next();
			System.out.println(a+"="+map.get(a));
					
		}

	}

	/*
	 * Map객체의 key들만 조회하는 메서드는 keySet()이다. 
	 * Map객체에서 key값은 중복 될수 없기 때문에 Set 객체로 리턴해준다. 
	 */
}
