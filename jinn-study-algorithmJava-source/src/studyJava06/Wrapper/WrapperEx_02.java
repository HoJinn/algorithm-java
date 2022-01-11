package studyJava06.Wrapper;

public class WrapperEx_02 {
	/* 
	 * Wrapper 클래스 상수
	 * Wrapper 클래스들은 MAX_VALUE, MIN_VALUE, SIZE, TYPE등의 상수를 공통적으로 가지고 있다. 
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("정수의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("정수의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("정수의 사이즈 : " + Integer.SIZE);
		System.out.println("float의 사이즈 : " + Float.SIZE);
		System.out.println("double의 사이즈 : " + Double.SIZE);
	}

}
