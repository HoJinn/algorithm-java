package studyJava11.StreamOrder;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptional {
	
	/* 
	 * count() 메서드와, sum()메서드를 제외한 나머지 메서드들의 리턴타입은 OptionalXXX 타입인데 
	 * XXX는 OptionalInt, OptionalLong, OptionalDouble 또는 그냥 Optional클래스가 있다. 
	 */
	public static void main(String[] args) {
		
		int[] arr = new int[100];
		for (int i=0; i<100; i++) { 
			arr[i] = i+1;
		}
		
		//리턴값 long
		long count = Arrays.stream(arr).count();
		System.out.println("요소들의 갯수 : " +count);
		
		//리턴값 int 
		int sum = Arrays.stream(arr).sum();
		System.out.println("요소들의 합 : " + sum);
		
		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("요소들 중 첫번째 값 : " + first.getAsInt());
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("요소들 중 최대 값 : " + max.getAsInt());
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("요소들 중 최소 값 : " + min.getAsInt());
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들의 평균 : " + avg.getAsDouble());
		
	}
}
