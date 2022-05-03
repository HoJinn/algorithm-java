package studyJava08.Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapReEx_03 {
	
	/*
	 * 이번에는 HashMap 키 정렬에 대해 공부해보자.  
	 * 
	 * HashMap을 정렬하기 위해서는 Arrays.sort 메서드를 사용해야 한다. 
	 * Arrays.sort 사용하기 위해서는 java.util.Arrays를 import해줘야 한다. 
	 */
	public static void main(String[] args) {
		// Map 선언
		Map<Integer, String> testMap = new HashMap<Integer, String>();

		// Map에 데이터 추가
		testMap.put( 1, "apple");
		testMap.put( 4, "pineapple");
		testMap.put( 2, "orange");
		testMap.put( 5, "strawberry");
		testMap.put( 3, "melon");

		// 키로 정렬
		Object[] mapkey = testMap.keySet().toArray();
		Arrays.sort(mapkey);

		// 결과 출력
		for (Integer nKey : testMap.keySet())
		{
			System.out.println(testMap.get(nKey));
		}
	}
}