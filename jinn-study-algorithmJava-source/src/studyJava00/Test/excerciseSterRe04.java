package studyJava00.Test;

public class excerciseSterRe04 {
	
	// 순서대로 별 찍기 다시 복습 해보자. 
	public static void main(String[] args) {
		// 줄반복 
		for (int i=1; i<=5; i++) { 
		
		// 별반복 
		for (int j=1; j<=i; j++) { 
			System.out.print("*");
		}
		System.out.println("");
		}
	}
}