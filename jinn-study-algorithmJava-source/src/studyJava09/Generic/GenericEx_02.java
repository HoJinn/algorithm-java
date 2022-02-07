package studyJava09.Generic;

public class GenericEx_02 {
	
	/*
	 * 제네릭 타입 표현식을 두개 사용할 수 있는 방법 
	 */
	public static void main(String[] args) {
		
		Generic2<String, Integer> gen1 = new Generic2<String, Integer>();
		gen1.set("홍길동", 1111); 
//		gen1.set("이순신", "A111"); //에러 [매개변수가 Integer타입이 아니므로 컴파일러가 타입을 체크해 에러 나게됨]
		
		
		Generic2<String, String> gen2 = new Generic2<String, String>(); 
		gen2.set("이순신", "A1111"); 
		System.out.println("<String, String>");
		System.out.println("name : " + gen2.getName());
		System.out.println("id : " + gen2.getId());
	
	}
}
	class Generic2<K, V> { // K,V로 두개의 제네릭 타입을 지정 
		K name; 
		V id;
		
		void set(K name, V id) { 
			this.name = name; 
			this.id = id;
		}
		
		K getName() { 
			return name; 
		}
		
		V getId() { 
			return id;
		}
	}
	