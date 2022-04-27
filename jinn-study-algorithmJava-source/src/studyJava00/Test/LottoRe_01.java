package studyJava00.Test;

public class LottoRe_01 {
	
	/* 
	 * 로또번호 생성기 다시 복습해보자.
	 */
	public static void main(String[] args) {

		int[] lotto = new int[6]; 				     
		
		int idx = 0; 						     	   
		while (true) { 	 								
														
			int number = (int)(Math.random()*45)+1 ; 	// 우선순위를 적용하고자 괄호를 이용해 45를 먼저 곱하고 소숫점을 사라지게 끔 int정수로 강제형변환 진행. 소숫점이 사라지므로 0~44까지 랜덤수가 되므로 +1를 더한것. 
			
			boolean insert = true; 						
			for (int i=0; i<=idx; i++) { 				
				if (lotto[i] == number) { 
					insert = false; 
					break;
				}
			}
			if (insert == true) { 						
				lotto[idx] = number; 
				idx++;
			}
			if (idx == 6 ) break;						
		}
		for (int i=0; i<lotto.length; i++) { 			
			System.out.println(lotto[i]);
		}
	}
}