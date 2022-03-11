package studyJava12.Thread;

public class ThreadEx_04 {

	/* 
	 * 스레드 우선순위 적용 시 주의사항 
	 * 1. 우선순위 값은 상대적인 값이다. 
	 * 2. 스레드를 실행하기 전에 지정해야 한다. 
	 * 3. main() 메서드에서 실행하는 스레드인 경우 기본값이 5 이다. 
	 * 
	 * 우선순위를 적용할 대는 직접 정수 값을 설정하는 것보다 Thread 클래스의 static final Field값을 이용하는 것이 바람직하다. 
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> { 
			System.out.println("t1 스레드 시작");
			for (int i=0; i<50; i++) { 
				System.out.println("t1 : " + i);
			}
		});
		
		Thread t2 = new Thread(() -> { 
			System.out.println("t2 스레드 시작");
			for (int i=0; i<50; i++) { 
				System.out.println("t2 : " +i);
			}
		});
		
		//우선순위 지정 
		t1.setPriority(7);
		t2.setPriority(3);
		//t1의 모든 출력이 끝나고 t2가 출력되는 것을 알수있다. 
		
		
		t1.start();
		t2.start();
		
		}

	}

