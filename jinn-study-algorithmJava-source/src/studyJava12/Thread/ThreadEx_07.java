package studyJava12.Thread;

	/* 
	 * Join 메서드 
	 * 다른 스레드의 실행이 완료 될때까지 기다리는 메서드 
	 * 예를들어 합계 계산을 하는 두 스레드가 계산 작업 완료 후 
	 * 결과값을 받아 처리해야하는 경우 사용된다. 
	 */

public class ThreadEx_07 {
		
	public static void main(String[] args) {
		
		Sum t1 = new Sum();
		Sum t2 = new Sum(); 
		
		t1.start(); 
		t2.start();
		
		try { 
			t1.join(); // t1 스레드가 종료될때까지 대기 
			t2.join(); // t2 스레드가 종료될때까지 대기 
		} catch (InterruptedException e) { 
			
		}
		System.out.println("두 스레드의 sum 합계 = " + (t1.sum+t2.sum));
	}
}

class Sum extends Thread { 
	int sum = 0;
	@Override 
	public void run() { 
		for (int i=1; i<=100; i++) { 
			sum += i;
		}
	}
}
