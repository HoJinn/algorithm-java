package studyJava01.Jinn;

public class CloneEx {

	/* 
	 * clone() 메서드는 클론이라는 말 그대로 객체를 복제하기 위한 메서드 이다. 
	 * 원본 객체의 필드값과 동일한 값을 가지는 새로운 객체를 새로 생성하는 것이다. 
	 * clone() 메서드를 사용하기 위해서는 java.long 패키지에 잇는 Cloneable이라는 인터페이스를 구현한 클래스에서만 사용이 가능하다. 
	 * 
	 * 이유 : 객체를 복제하는 경우 데이터도 복제되기 때문에, 무분별한 복제를 줄이기 위해 클래스를 정의한 사람이 Cloneable 인터페이스를 
	 * 		 구현한다고 정의하는 것이 곧 복제를 허용한다는 의미가 되는 것이다. 
	 */
	public static void main(String[] args) {
		
		String[] arr = {"홍길동", "이순신", "김유신", "안중근"}; 
		String[] arr2 = arr.clone();
		
		System.out.println(arr == arr2);
		for (String v : arr2) { 
			System.out.println(v);
		}
		String[] arr3 = new String[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		
		System.out.println(arr == arr3);
		for (String v : arr3) { 
			System.out.println(v);
		}
	}
}
