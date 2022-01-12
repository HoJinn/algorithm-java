package studyJava07.util;

import java.util.Random;

/* 1부터 6까지 랜덤수를 총 5번 반복되도록 주사위를 돌려보자 */ 
public class RandomEx_02 {
	
	public static void main(String[] args) {
	Random rand = new Random (); 
	
	for (int i=0; i<5; i++) { 
		System.out.println(rand.nextInt(6)+1);	
		// (6)+1을 해준 이유는 nextInt(6)은 0부터 6미만 까지의 정수이기 때문에 주사위값인 1부터 7미만까지의 정수로 출력해주기 위해서 이다. 
		}
	} 
}
