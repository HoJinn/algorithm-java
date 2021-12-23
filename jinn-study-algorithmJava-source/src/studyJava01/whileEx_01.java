package studyJava01;

public class whileEx_01 {

	/* while문은 조건에 따라 반복여부를 결정하며 
	 * 조건식이 true인 경우에만 블록 내의 실행문이 반복실행 되게 된다. 
	 * 1 부터 55까지의 합을 구하는 소스를 while문으로 작성해보자.
	 */
	
	public static void main(String[] args) {
		int sum = 0; 
		int i = 1;
		
		while (i <=55) { 
			sum += i;
			i++;
		}
		System.out.println("합계 : " + sum ); // 실행결과 : 1540
	}

}
