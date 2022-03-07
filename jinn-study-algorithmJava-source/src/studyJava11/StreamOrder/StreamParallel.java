package studyJava11.StreamOrder;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel {

	/* 
	 * 스트림 병렬처리 
	 * 스트림 객체를 생성할 때 사용하는 stream() 메소드 대신 parallelStream()메소드를 사용하면 병렬 스트림을 쉽게 생성
	 * 할수 있습니다. 병렬 처리시 내부적으로 전체 요소들을 서브요소로 나누고 이 버스요소들을 개별 쓰레드로 처리한다. 
	 * 이 서브 요소들의 처리 결과를 결합하여 최종 처리 결과를 리턴하게 된다. 
	 * isParallel()메서드를 이용하여 병렬 여부를 확인 할 수도 있으며 순차처리 방식과 병렬처리 방식의 처리 실행속도를 비교해보자.
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(); 
		for (int i=0; i<100; i++) { 
			list.add(i);
		}
		
		long start = System.nanoTime(); 
		// stream() 순차적 스트림 처리 
		list.stream().forEach(a -> { 
			try { 
				Thread.sleep(1);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		});
		
		long end = System.nanoTime();
		System.out.println("순차 스트림 처리 시간 : " +(end-start)+"nano sec");
		
		start = System.nanoTime();
		// parallelStream() 병렬 스트림 처리 
		list.parallelStream().forEach(a -> { 
			try { 
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		end = System.nanoTime();
		System.out.println("병렬 스트림 처리 시간 : " +(end-start)+"nano sec");
	}
 
	/* 
	 * 무조건 병렬 스트림 처리가 순차적 스트림 처리보다 빠른 것은 아니다. 
	 * 요쇼의 수가 적거나 요소처리 시간이 짧으면 순차적 처리가 병렬 처리보다 빠를 수 있다. 
	 * 이유는 병렬처리를 하는 경우 스레드를 생성하는 시간이 추가적으로 발생하기 때문이다. 
	 * 또한 CPU 코어의 수에 따라 병렬 처리 성능의 차이가 커진다. 
	 * 즉 코어의 수가 많아질 수록 병렬처리 속도가 빨라지는것이다. 방대로 코어가 하나인 경우(싱글코어) 순처적 처리가 더 빠를수 있다. 
	 */
}
