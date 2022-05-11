package studyJava08.Collection;

import java.util.Hashtable;

public class HashTableEx_01 {

	/* 
	 * HashTable
	 * HashMap과 구조가 비슷하지만 용도는 다르다.
	 * HashTable은 키와 값을 1:1형태로 가져가며 HashTable에 저장이 된다. 
	 *  (key는 값을 식별하기 위한 고유한 key이며 값은 key가 가진 값을 의미한다.) 
	 *  
	 *  HashMap과 반대로 동기화가 이루어진다. 
	 *  HashMap에서는 값으로 null이 입력이 가능하지만 HashTable에서는 null입력이 불가능하다.
	 *  
	 *  
	 */
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable(); //Object로 설정 
		Hashtable<Integer, Integer> i = new Hashtable<Integer,Integer>(); // 타입 선언
		Hashtable<Integer, Integer> i2 = new Hashtable<>();
		Hashtable<Integer, Integer> i3 = new Hashtable<Integer,Integer>(i); // i의 Hashtable을 i3로 값 이전
		Hashtable<Integer, Integer> i4 = new Hashtable<Integer,Integer>(10); // 초기용량 지정 
		Hashtable<Integer, Integer> i5 = new Hashtable<Integer,Integer>() // 변수 선언 + 초기값 지정
		{{ 
			put(1, 100); 
			put(2, 200);
		}};
			
		Hashtable<String, String> str = new Hashtable<String, String>(); // String, String 타입 선언 
		Hashtable<Character, Character> ch = new Hashtable<Character,Character>(); // Char, Char 타입 선언
		/* 
		 * HashTable은 하나의 Entrydp key,Value 2개를 가지고 있다. 
		 * 타입을 선언 하려면 두 개를 동시에 선언해줘야 한다.  
		 * 
		 * Hashtable<타입, 타입> 변수명 = new Hashtable<타입, 타입>();으로 선언
		 */
		
		}		
	}

