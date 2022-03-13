package studyJava12.Thread;

import java.util.Map.Entry;

public class ThreadEx_06 {
	
	/* 
	 * interrupt() 메서드 
	 * 스레드가 일시 정지 상태에 있을 때 InterruptException 예외를 발생시켜 run()메서드를 정상종료 시킬수 있다. 
	 */
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() { 
			
			@Override
			public void run() { 
				try { 
					int i=1; 
					while (true) { 
						System.out.println("t1:" +i);
						// sleep을 넣지 않으면 interrupt되지 않음 
						Thread.sleep(1000);
						i++;
					}
				} catch (InterruptedException e) { 
				
				}
				System.out.println("스레드 실행 종료");
			} 
		});
	
		t1.start();
		try { 
			Thread.sleep(1000); 
		} catch(InterruptedException e) { 
			
		}
		t1.interrupt();
		}
	}
