package studyJava12.Thread;

public class ThreadEx_01 {

	/* 
	 * 스레드를 생성하는 방법은 크게 두가지로 나뉜다. 
	 * 하나는 Thread클래스를 상속 받는 방법 
	 * 다른 하나는 Runnable 인터페이스를 구현한 객체를 Thread객체에 넣어주는 방식으로 스레드를 생성할 수 있다. 
	 * 
	 * 일반적으로  Runnable 인터페이스를 구현하는 방식으로 많이 사용된다. 
	 */
	public static void main(String[] args) {

		// Thread 상속 받는 방법 
		ThreadExtend t1 = new ThreadExtend(); 
		
		// Runnable 구현하는 방법 
		Runnable r = new RunnableImple(); 
		
		// Thread 생성자의 매개변수로 전달 
		Thread t2 = new Thread(r); 
		
		t1.start();
		t2.start();
	}
}

class ThreadExtend extends Thread { 
	public void run() { 
		System.out.println("Thread 상속받는 방법");
		for (int i=0; i<50; i++) { 
			System.out.println("ThreadExtend : " + i);
		}
	}
}

class RunnableImple implements Runnable { 
	public void run() { 
		System.out.println("Runnable 구현하는 방법");
		for (int i=0; i<50; i++) { 
			System.out.println("RunnableImple :" + i);
		}
	}
}