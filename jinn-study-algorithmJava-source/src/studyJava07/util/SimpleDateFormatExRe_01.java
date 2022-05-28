package studyJava07.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatExRe_01 {
	
	/* 
	 * SimpleDateFormat을 이용해서 Calender객체를 Date객체로 변화하는 방법 다시 복습진행 해보자. 
	 * 
	 */
	public static void main(String[] args) {
				//Calendar 와 Date 간의 변환진행 
				Calendar cal = Calendar.getInstance();
				cal.set(2022, 4, 28); // 2022년 5월 28일 (월은 +1)
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