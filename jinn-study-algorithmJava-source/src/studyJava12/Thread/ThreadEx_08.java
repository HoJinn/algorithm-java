package studyJava12.Thread;

public class ThreadEx_08 {
	
	/* 
	 * 스레드 그룹 
	 * 스레드 그룹은 서로 관련되 스레드를 그룹핑해서 다루기 위한 것으로 
	 * 보관 상자에 물건들을 종류별로 구분해서 담듯이 스레드들을 종류별로 구분해서 담아 놓을 수 있다.  
	 * 그 그룹안에 또 다른 그룹도 생성할수 있으며 보안상의 이유로 자신이 속한 그룹이나 하위 그룹은 변경할 수 있지만, 다른 그룹은 변경 할 수 없다.  
	 */
	public static void main(String[] args) {
		
		//그룹 객체 생성 
		ThreadGroup group = new ThreadGroup("Group1"); 
		MyThread t1 = new MyThread(group, "First"); 
		MyThread t2 = new MyThread(group, "Second");
		MyThread t3 = new MyThread(group, "Third");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		//모든 스레드 중지 
			group.interrupt();
		}
	}
}
	class MyThread extends Thread { 
		MyThread(ThreadGroup group, String name) { 
			super(group, name); 
		}
		
		@Override 
		public void run() { 
			while (true) { 
				System.out.println(getName());
			try { 
			sleep(500);
		} catch (InterruptedException e) { 
			System.out.println(getName() + "interrupted 발생");
			break;
		}
	}
			System.out.println(getName() + "종료");
		}
	}