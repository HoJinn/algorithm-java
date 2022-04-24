package studyJava00.Test;

public class excerciseSter03 {
	
	// 별 피라미드 찍기
	public static void main(String[] args) {
		// 줄반복 
		for (int i=1; i<=5; i++) { 
			// 공백 출력 
			for (int j=5 -i; j>0; j--) { 
				System.out.print(" ");
			}
			// 별 반복 
			for (int f=1; f<=i*2-1; f++) { 
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}