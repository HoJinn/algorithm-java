package studyJava08.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapReEx_02 {

	/*
	 * HashMapPut() 
	 * put()은 인자로 key와 value를 받습니다. 
	 * 전달된 인자는 HashMap에 key 와 value관계로 저장이 됩니다. 
	 * 
	 * get()은 인자로 전달되 key에 해당하는 value를 리턴해 줍니다.
	 * key가 존재하지 않으면 null를 리턴합니다. 
	 * 
	 * 다음은 get()으로 value를 가져오는 예제를 공부해보자.
	 */
	public static void main(String[] args) {
		
		Map<String, Integer> fruits = new HashMap<>();
		fruits.put("apple", 1);
		fruits.put("banana", 2);
		fruits.put("kiwi", 3);

		System.out.println("get(apple): " + fruits.get("apple"));
		System.out.println("get(kiwi): " + fruits.get("kiwi"));
		System.out.println("get(undefined): " + fruits.get("undefined"));
	}

}
