package studyJava08.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx_04 {

	/* 
	 * 이번에는 key 와 value 싸으로 조회하는 예제를 만들어 보자 
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
		
		//Map 객체는 (키,값) 쌍으로 이루어진 객체들의 모임 
		// (키,값) 쌍으로 조회하기 
		
		Set entry = map.entrySet(); 
		for (Object o : entry) { 
			Map.Entry m = (Map.Entry)o; 
			System.out.println("Key : " + m.getKey() + ", value : " + m.getValue());
		}

	}

	/* 
	 * entrySet() 메서드는 키가 중복이 안되므로 중복이 허용되지 않는다. 그러므로 Set객체로 리턴한다. 
	 * key,value의쌍인 객체의 자료형은 Map.Entry형이다. 
	 * Map은 여러 개의 데이터가 모아서 하나의 의미를 갖는 데이터를 만들 때 주로 사용한다. 
	 */
}
