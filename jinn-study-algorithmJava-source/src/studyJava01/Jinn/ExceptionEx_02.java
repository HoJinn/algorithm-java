package studyJava01.Jinn;

public class ExceptionEx_02 {
	
	/* 
	 * try 블록 안에서 예외가 발생한 경우
	 * - 발생한 예외와 일치하는 catch문이 잇는지 확인한다.  
	 * - 만약 일치하는 catch문이 있다면, 해당 catch문의 블럭 내의 실행문들을 실행하고, 전체 try-catch구문이 종료된다. 
	 * 	 일치하는 catch문이 없으면 예외 처리를 하지 못한다. 
	 * 
	 * try 블록 안에서 예외가 발생하지 않은 경우 
	 * - catch 구문을 모두 확인하지 않고, 전체 try-catch 구문이 종료된다. 
	 */
	
	public static void main(String[] args) { 
		System.out.println(1);
		try { 
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		} catch (ArithmeticException e) { 
			System.out.println(5);		// try블록 내에서 예외가 발생하지 않았기 때문에 catch문의 실행문이 실행되지 않은것
		}
		System.out.println(6);
	}
}
