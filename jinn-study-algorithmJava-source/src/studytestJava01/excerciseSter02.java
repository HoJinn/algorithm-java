package studytestJava01;

public class excerciseSter02 {
	
	// 역순으로 별찍기
	public static void main(String[] args) {
		// 줄반복 
		for (int i=5; i>=1; i--) { 
			// 별 반복 
			for (int j=1; j<=i; j++) { 
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
