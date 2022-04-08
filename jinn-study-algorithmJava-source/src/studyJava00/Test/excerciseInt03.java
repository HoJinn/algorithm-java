package studyJava00.Test;

public class excerciseInt03 {
	
	/* 
	 * 매개변수를 두개 입력받아 해당하는 범위의 난수를 생성하는 메소드 
	 */
	public static int makeRandom(int first, int second) {
		int amount = 0;
		int random = 0;
		
		if(first < second) {
			amount = second - first + 1;
			random = (int)(Math.random() * amount) + first;
		}else {
			amount = first - second + 1;
			random = (int)(Math.random() * amount) + second;
		}
		
		return random;
	}
	
	/* 
	 * 앞 , 뒤 라는 문자열중 하나를 랜덤하게 반환하는 메소드를 만들어보자 . 
	 */
	public static String Coin() {
		
		int random = excerciseInt03.makeRandom(0, 1);
		
		return random == 0? "앞" : "뒷";
	}
}
