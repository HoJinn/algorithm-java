package studyJava08.Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx_02 {
	
	/* 
	 * HashTable 값 추가하기 
	 * HashTable의 값을 추가하는 방법은 put(Key,Value)메서드를 사용하여 값을 추가한다. 
	 * put()메서드를 사용하여 key가 같고 Value가 다른 값을 중복해서 넣으면 나중에 넣은 Value값으로 변경 된다. 
	 * 
	 */
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>(); //Hashtable 선언 
		
		//값 추가하기 
		ht.put("1", "Hello1");
		ht.put("2", "World2");
		ht.put("3", "Hello3");
		ht.put("4", "World3");
		ht.put("2", "HelloWorld2");
		
		System.out.println(ht);  // 결과 출력 
		
//		// HashTable 값 삭제하기 
//		ht.remove("2"); 
//		System.out.println(ht); // 결과 출력 
		
//		ht.clear(); 
		
//		// HashTable 크기 구하기
//		System.out.println("Size : " + ht.size()); // 결과 출력 
		
		// HashTable 값 출력하기 (향상된for문)
		for(Map.Entry<String, String>e : ht.entrySet())
			System.out.println("key : " + e.getKey() + " , Value : " + e.getValue());
		
		
		

	}

}
