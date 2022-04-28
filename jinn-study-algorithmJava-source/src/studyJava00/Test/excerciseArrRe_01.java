package studyJava00.Test;

public class excerciseArrRe_01 {

	/* 하나의 배열엔 1부터 10까지 10개의 정수가 저장되어 있고 
	 * 각각의 값을 다른 배열의 해당 인덱스 값에 제곱값을 대입하는 코드 복습해보자.
	 */
	public static void main(String[] args) {
			
		int[] num3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
		int[] num4 = new int[10]; 
		
		for (int i=0; i<num3.length; i++) { 
			num4[i] += num3[i] * num3[i];
		}
		
		for (int i=0; i<num4.length; i++) { 
			System.out.println("num4 = " + num3[i]);
		}
	}
}
