package studyJava00.Test;

public class GuguRe_01 {

	// 반복문 활용한 구구단 다시 복습해보자. 
	public static void main(String[] args) {
		
		for(int j=2; j<20; j++) { 
			System.out.println("["+j+"단]");
			for (int i=1; i<10; i++) { 
				System.out.println(j + "*" + i +"=" + j*i);
			}
		}
		
	}

}
