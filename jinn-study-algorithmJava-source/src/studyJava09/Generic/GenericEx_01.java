package studyJava09.Generic;

public class GenericEx_01 {

	/*
	 * Object클래스를 사용하면 모든 클래스를 사용할 수 잇는 편리함이 있지만 잘못 사용된 타입때문에 발생하는 
	 * 문제점을 제거하기 위해 제네릭을 사용해 타입을 체크한다. 
	 * 
	 * 실행 중에 에러가 나는 것 보다 미리 타입을 체크하게 만들어 컴파일 시 에러를 내면 런타임 에러를 사전에 방지 할 수 있다. 
	 * 컴파일 때는 에러가 안나지만 실행 중에 에러가 나게되는 예제를 만들어 보자. 
	 */
	public static void main(String[] args) {
		
		NoGeneric nogen = new NoGeneric();
		String[] ss = {"홍길동", "이순신", "김유신"} ;
		
		//Object 타입의 매개변수에 String 배열 객체 전달 
		nogen.set(ss);
		nogen.print();
		
		Object[] objs = nogen.get(); 
		for (Object o : objs) { 
			String s = (String)o; //String으로 강제형변환
			System.out.println(s);
		}

		Integer[] ii = {1,2,3}; 
		
		//Object 타입의 매개변수에 Integer 배열 객체전달 
		nogen.set(ii);
		objs = nogen.get(); 
		
		for (Object o : objs) { 
			String s = (String)o; //String으로 강제형변환 (에러발생) 
			System.out.println(s);
		}
		
	}

}

class NoGeneric { 
	Object[] v;
	
	void set(Object[] n) { 
		v = n;
	}
	
	Object[] get() { 
		return v;
	}
	
	void print() {
		for (Object o : v) { 
			System.out.print(o+"");
		}
		System.out.println();
	}
}