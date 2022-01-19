package studyJava07.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
 * Date객체만 SimpleDateFormat의 format() 메서드의 매개변수로 넣을 수 있기 때문에 
 * Calendar객체를 Date객체로 변환하는 방법을 나타내는 예제
 */

public class SimpleDateFormatEx_02 {

	public static void main(String[] args) {
		//Calendar 와 Date 간의 변환은 다음과 같이 한다. 
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 0, 19); // 2022년 1월 19일 (월은 +1)
		Date day = cal.getTime();
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyy-MM-dd hh:mm:ss a");
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));
		
	}

}
