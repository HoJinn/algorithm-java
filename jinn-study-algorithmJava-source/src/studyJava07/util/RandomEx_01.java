package studyJava07.util;

import java.util.Random;

public class RandomEx_01 {
	
	/* 
	 * util이라는 단어를 사전에 찾아보면 "쓸모있는, 유용한, 도움이 되는..."의 의미를 갖는 단어이다. 
	 * 자바 프로그래밍에서자주 사용되는 유용한 기능들을 모아둔 패키지이므로 잘 기억해 두자.
	 */
	
	/* 
	 * Random클래스 
	 * 랜덤수를 생성해 주는 기능이 있는 클래스 
	 * Meth클래스에도 random()메서드가 있지만, double자료형으로만 랜덤수를 구할 수 있어, Random클래스를 이용하면 
	 * boolean,int,long,float등 다양한 자료형으로 랜덤수를 구할 수 있다. 또한 seed값을 설정해서 같은 랜덤수를 얻을수 있다. 
	 */
	public static void main(String[] args) {
		
		Random r1 = new Random (42); 
		Random r2 = new Random (42);
		
		System.out.println("r1");
		for (int i=0; i<5; i++) { 
			System.out.println(i + "=" + r1.nextInt());
		}
		System.out.println("r2");
		for (int i=0; i<5; i++) { 
			System.out.println(i + "=" + r2.nextInt());
		}
	}
	
	/*
	 * 9,10라인에서 Random 객체를 생성할 때 seed값으로 42를 매개변수로 넣어줬다. 
	 * 랜덤값이지만 r1과 r2는 모두 동일한 값으로 출력한다. 
	 * seed값은 나중에 다시 실행해도 동일한 결과를 나타낼수 있도록 값을 지정하는 것이다. 
	 */

}
