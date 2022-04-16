package studyJava00.Test;

public class Calculator {
	
	/* 
	 * 1부터 10까지의 총 합을 반환하는 메소드를 만들어 보자 
	 */
	
	public int sum1to10() { 
		int sum = 0; 
		
		for(int i = 0; i <=10; i++) { 
			sum += i; 
		}
		return sum; 
	}
	
	/* 
	 * 3개의 매개변수 중 더 큰수를 출력하는 메소드를 만들어보자 
	 */
	
	public void checkMaxNumber(int a,int b, int c) { 
		int max = a; 
		
		if(a > b) { 
			max = a;
		}
		if(b > a) { 
			max = b; 
		if(c > a) { 
			max = c;
		}
		System.out.println("세숫자 중 큰 수는 " + max + "이다. ");
		
		return;
		}
	}
	/* 
	 * 2개의 매개변수의 합을 반환하는 메소드를 만들어보자.
	 */
	public int sumTwoNumber(int first, int second) { 
		int sum = first + second; 
		
		return sum; 
	}
	/* 
	 * 	첫째 매개변수 , 두번째 매개변수를 뺀 값을 반환하는 메소드를 만들어보자. 
	 */
	public int minusTwoNumber(int first, int second){
		
		return first - second;
	}
}
