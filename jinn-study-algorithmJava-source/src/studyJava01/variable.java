package studyJava01;

public class variable {

	public static void main(String[] args) {
		
		/* 정수 
		 * 변수에 값을 대입하는 방법을 보여주는 예제 
		 */ 
		int a; 
		a = 1; 
		System.out.println(a+1); // 2
		
		a = 2; 
		System.out.println(a+1); // 3
		
		/* 실수 
		 * 실수를 담는 방법을 보여주는 예제 
		 */
		double b = 1.1; 
		System.out.println(b+1.1); // 2.2 
		
		b = 2.1; 
		System.out.println(b+1.1); // 3.2 
		
		/* 문자열 변수 
		 * 변수 : 변할 수 잇는 수 라는 뜻 
		 * 프로그래밍에서의 변수에는 다양한 데이터 형이 담겨딜 수 있다. 다음 예제는 변수의 값이 꼭 숫자가 와야 하는 것은 아니라는 것을 보여주는 예제
		 */
		
		String first = "coding"; 
		System.out.println(first + " " + "Java"); // coding Java
		
		String c,d; 
		c = "coding"; 
		d = "Java"; 
		System.out.println(c + " " + d); // coding Java
	}
}
