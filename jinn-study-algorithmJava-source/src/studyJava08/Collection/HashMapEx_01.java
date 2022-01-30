package studyJava08.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx_01 {

	/* 
	 * HashMap은 key의 순서를 알 수 없고 TreeMap은 Key의 순서가 크기 순이며 
	 * LinkedHashMap은 key의 순서가 저장된 순서이다. 
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
		
		//출력 
		System.out.println(map);
		System.out.println("홍길동 번호 :" + map.get("홍길동"));
		System.out.println("이순신 번호 :" + map.get("이순신"));
		System.out.println("김유신 번호 :" + map.get("김유신"));

	}

	/*
	 * key값으로 저장된 객체를 검색하기 위해서 사용하는 메서드가 map.get("홍길동")이다. 
	 * "홍길동"을 key로 하는 value를 리턴한다. 또한 위의 예제에서 key에 "김유신"이 중복 입력이 되므로 김삿갓은 한개만 저장이 된다.
	 * 두번째 "김유신"은 새로운 값으로 대체 되는 것이다. value는 기존의 내용을 수정 되어 2345로 출력되는것을 확인할수 있다. 
	 */
}
