package studyJava08.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx_02 {

	/* 
	 * Iterator의 장점
	 * 1. Collection에서 요소를 제어하는 기능
	 * 2. next() 및 privious()를 써서 앞뒤로 이동하는 기능 
	 * 3. hasNext()를 써서 더 많은 요소가 있는지 확인하는 기능 
	 * 
	 * ArrayList를 만들고 값을 넣은 후, 
	 * 이 리스트에 대해 iterator를 만든 다음 반복문을 통해 값을 출력하는 간단한 예제를 만들어보자. 
	 */
	public static void main(String[] args) {

		//컬렉션 생성 
		ArrayList<String> cars = new ArrayList<>(); 
		cars.add("벤츠");
		cars.add("현대");
		cars.add("기아"); 
		cars.add("아우디"); 
	
		//iterator 생성 
		Iterator<String> iterator = cars.iterator();
		
//		// while문을 사용한 경우
//        while(iterator.hasNext())
//        {
//            String str = iterator.next();
//            System.out.println(str);
//	}
            
         // for-each문을 사용한 경우
        for (String str : cars )  
        { 
        	System.out.println(str);
          }
       }
	}