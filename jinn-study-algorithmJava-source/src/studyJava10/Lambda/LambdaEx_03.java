package studyJava10.Lambda;

public class LambdaEx_03 {
	
	/* 
	 * 이번에는 매개변수도 있고 리턴타입도 있는 경우의 예제를 만들어 보자. 
	 */
	public static void main(String[] args) {
		
		LambdaInterface4 f4 = (x,y) -> { 
			return x * y; 
		}; 
		
		System.out.println("두 수의 곱 : " + f4.cal(3,2));		//실행결과 : 6 
		
		f4 = (x,y) -> x + y;
		System.out.println("두 수의 합 : " + f4.cal(3,2));		//실행결과 : 5
		
		f4 = (x,y) -> { return x/y; }; 
		System.out.println("두 수의 몫 : " + f4.cal(5,2));		//실행결과 : 2 
		
		f4 = (x,y) -> x%y; 
		System.out.println("두 수의 나머지 : " + f4.cal(5,2));		//실행결과 : 1
		
		f4 = (x,y) -> sum(x,y); 	// return문이 생략된 형태로 sum() 메서드에 매개변수 x,y를 넘겨주고 sum() 메서드에서 리턴 받은 결과값을 다시 리턴한 형태이다. 
		System.out.println("두 수의 합(sum()) : " + f4.cal(3,2));	//실행결과 : 5
	}
	
	static int sum(int x, int y) { 
		return x+y;
	}
}

@FunctionalInterface 
interface LambdaInterface4 { 
	int cal(int x, int y);
}