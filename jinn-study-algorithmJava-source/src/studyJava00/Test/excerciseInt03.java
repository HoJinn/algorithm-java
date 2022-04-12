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
	
	
	/* 
	 * "가위", "바위", "보" 문자열 중에 하나 랜덤으로 반환하는 메소드를 만들어보자.
	 * 
	 */
	public static String rockPaperScissors() {
		
		int random = excerciseInt03.makeRandom(0, 2);
		
		return random == 0? "가위": random == 1? "바위" : "보";
	}
	
	/* 
	 * 매개변수로 넘어온 숫자 갯수만큼 임의의 영어 알파벳들을 
	 * String으로 반환하는 메소드를 만들어보자. 
	 */
	public static String randomAlphabet(int length) {
		
		String alphaRandom = "";
		for(int i = 0; i < length; i++) {
			
			alphaRandom += (char) excerciseInt03.makeRandom('A', 'Z');
		}
		
		return alphaRandom;
	} 
		/* 
		 * randomAlphabet 출력되는 대문자 영단어를 소문자 
		 * String으로 반환하는 메소드를 만들어보자 
		 */
	public static String LowerAlphabet(int length) { 
		
		String randomAlpha = randomAlphabet(length);
		String resultAlpha = "";
		
		for(int i = 0; i < length; i++) {
			resultAlpha += (char)(randomAlpha.charAt(i) + 32);
		}
		return resultAlpha;
	}
}



