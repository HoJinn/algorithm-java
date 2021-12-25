package studytestJava01;

public class Lotto {
	
	/* lotto 생성프로그램 만들기
	 * 1. 로또 번호를 담아둘 길이가 6개인 정수 타입의 배열 변수 생성
	 * 2. 1~45까지의 번호중에 하나를 뽑는다. 
	 * 3. 만약 뽑은 번호가 배열에 있다면 다시 뽑고, 없다면 배열에 넣는다. 
	 * 4. 6개의 번호를 다 뽑을때까지 반복한다. 
	 * 5. 6개의 번호를 출력한다. 
	 */
	
	public static void main(String[] args) {
		
		int[] lotto = new int[6]; 				     	// 정수타입의 길이가 6인 배열 변수를 선언. 
		
		int idx = 0; 						     	    // idx라는 변수를 선언, 로또번호의 인덱스 값을 담을 변수로 초기값은 0으로 초기화 진행. 
		while (true) { 	 								// while문을 이용해 반복시킬 내용을 중관호 블록아넹 넣고 조건은 true로 지정. 
														// 중복된 번호가 몇번 나올지 모르므로 반복횟수를 알수 없어 일단 무한반복되도록 하고, while문 안에 로또번호 다 채우면 반복 중지. 
			int number = (int)(Math.random()*45)+1 ; 	// 우선순위를 적용하고자 괄호를 이용해 45를 먼저 곱하고 소숫점을 사라지게 끔 int정수로 강제형변환 진행. 소숫점이 사라지므로 0~44까지 랜덤수가 되므로 +1를 더한것. 
			
			boolean insert = true; 						// boolean 자료형 변수 초기값 true로 진행.
			for (int i=0; i<=idx; i++) { 				// 반복문으로 1 ~ 45 사이의 랜덤수와 중복된 번호가 있는지 확인. 
				if (lotto[i] == number) { 
					insert = false; 
					break;
				}
			}
			if (insert == true) { 						// 위에 중복된 번호라고 판별이 안됬으면 if 문 다시 실행.
				lotto[idx] = number; 
				idx++;
			}
			if (idx == 6 ) break;						// idx변수의 값이 6이 되면 while문 중지.
		}
		for (int i=0; i<lotto.length; i++) { 			// 로또 배열변수를 for문으로 변수를 반복시키며 인덱스로 출력.
			System.out.println(lotto[i]);
		}
	}
}
