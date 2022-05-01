package studyJava08.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapReEx_01 {

	/* 
	 * HashMap에 대해 다시 복습 진행 해보자. 
	 *  Map 인터페이스를 구현한 대표적인 Map 컬렉션입니다. 
	 *  Map 인터페이스를 상속하고 있기에 Map의 성질을 그대로 가지고 있습니다. 
	 *  Map은 키와 값으로 구성된 Entry객체를 저장하는 구조를 가지고 있는 자료구조입니다. 
	 *  여기서 키와 값은 모두 객체입니다. 값은 중복 저장될 수 있지만 키는 중복 저장될 수 없습니다.
	 */
		public static void main(String[] args) {
			// Map 객체 생성 
			Map map = new HashMap(); 
			
			// 이름이 담긴 문자열 배열 생성 
			String[] names = { "복길이", "김유신", "이순신", "강감찬" ,"김유신"} ; 
			// 숫자가 담긴 정수 배열 생성 
			int[] nums = {1234,4567,2350,9870,2345};
			
			//Map 객체에 두 배열의 값들을 키와 밸류 쌍으로 저장 
			for (int i=0; i<names.length; i++) { 
				map.put(names[i], nums[i]);
			}
			
			//출력 
			System.out.println(map);
			System.out.println("복길이 번호 :" + map.get("복길이"));
			System.out.println("이순신 번호 :" + map.get("이순신"));
			System.out.println("김유신 번호 :" + map.get("김유신"));

		}
}
