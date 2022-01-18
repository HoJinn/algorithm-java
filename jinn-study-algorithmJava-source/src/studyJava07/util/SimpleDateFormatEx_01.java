package studyJava07.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx_01 {

	/* 년,월,일,시간을 모두 따로 구해서 문자열 포맷에 맞춰 다시 출력하는 것은 너무 불편하다.  
	 * 그래서 SimpleDateFormat이라는 클래스를 사용하면 아주 쉽게 처리할 수 있게 된다. 
	 */
	public static void main(String[] args) {
		
		Date now = new Date(); 
		System.out.println(now);
		SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd HH:mm:ss E a"); 
		System.out.println(df.format(now));
	
	}
}
