package studyJava01.Jinn;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println(1);
		try { 
			System.out.println(2);
			System.out.println(3/0);
			System.out.println(4);
		} catch (ArithmeticException e) { 
			System.out.println(5);
		}
		System.out.println(6);
	}
	/* 
	 * main()메서드 안에서 1을 출력하고 try 블록안에 2를 출력하고 3을 0으로 나누고 있다. 
	 * 여기서 exception이 발생한다. try블록 안에서 예외가 발생햇기 때문에 catch 블록이실행되어 4 출력하는 구문은 건너띄고 
	 * chatch 블록 안의 5가 출력이 된다. 
	 * 또한 try-catch구문이 끝나고 6이 출력되는것을 확인할수 있다. 
	 * 만약 try-catch구문을 사용하지 않았거나 예외가 발생할 가능성이 있는 구문을 try블록에 넣지 않았으면 
	 * 2까지만 출력되고 프로그램은 비정상덕으로 종료 되었을것이다.  
	 */
}
