package studyJava00.Test;

public class excerciseSter01 {
	
	// 순서대로 별 찍기 
	public static void main(String[] args) {
		// 줄 반복 
		for (int i=3; i<=5; i++) { 
			// 별 반복 
			for (int j=1; j<=i; j++) { 
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
