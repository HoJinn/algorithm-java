package studyJava01.Jinn;

public class forEx_02 {

	/* 1부터 100까지의 합을 구해보자. 변수의 초기값은 1이고 i<= 50이라는 
	 * 조건식이 만족할 때까지 1씩 증가하면 될 것이다.
	 * 
	 *  1부터 50까지 변하면서 sum이라는 변수에 +=로 더하고 대입해주면 전체 합계를 구할 수 있다. 
	 */
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=50; i++) { 
			sum += i; 
		}
		
		System.out.println("합계 : " +sum); // 실행결과 : 1275
	}

}
