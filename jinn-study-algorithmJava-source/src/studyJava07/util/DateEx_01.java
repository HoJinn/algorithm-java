package studyJava07.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
 * Date클래스는 날짜와 시간을 표현하는 클래스로 오늘 일자와 시간, 또는 특정일자의 일자와 시간을 처리할 때 사용한다.  
 */
public class DateEx_01 {

	public static void main(String[] args) {
		
		Date now = new Date(); 
		System.out.println(now);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");  
		//SimpleDateFormat : 날짜,시간의 포맷을 지정해 줄수 있는 클래스로 연도-월-일 시간:분 초 요일 오전/오후 형태로 출력된다. 
		System.out.println(sd.format(now));
	}

}
