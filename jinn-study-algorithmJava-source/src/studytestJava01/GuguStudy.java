package studytestJava01;

public class GuguStudy {

	//반복문 활용한 구구단 출력해보기.
	public static void main(String[] args) {
		
		for (int j=2; j<10; j++) { 
			System.out.println("["+j+"단]");
			for (int i=1; i<10; i++) { 
				System.out.println(j + " * " + i + " = " + j*i);
			}
		}
	}
}
