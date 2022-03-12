package studyJava12.Thread;

public class ThreadEx_05 {

		/* 
		 * 스레드 상태제어 
		 * 1. sleep()메서드 
		 * 	실행중인 스레드를 원하는 시간만큼 멈추고 싶을 때 sleep()메서드를 사용한다. 
		 * 	매개변수의 값(천분의 1초)만큼 일시정지 했다가 다시 실행 상태로 돌아간다. 
		 * 	해당 메서드는 InterruptedException처리를 강제하기 때문에 try 구문 안에 작성해야 한다. 
		 */
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) { 
					System.out.println("t1 : "+ i);
				try {
					Thread.sleep(1000);		// 1초 동안 일시정지가 된다.  매개변수의 천분의 1초만큼 일시정지 시킬때 사용.
				} catch (InterruptedException e) {}
			}
				System.out.println("스레드 실행 종료");
			}
		});
		t1.start();
	} 
}
