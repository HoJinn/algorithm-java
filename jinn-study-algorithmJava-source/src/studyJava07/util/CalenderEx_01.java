package studyJava07.util;

import java.util.Calendar;

public class CalenderEx_01 {

	/* 
	 * Calender클래스는 Date클래스 보다 나중에 jdk에 추가된 클래스로 보다 향상된 기능을 제공한다. 
	 * 최근에 Date클래스 보다 Calendar클래스를 더 많이 사용한다. 
	 * Calendar클래스는 추상 클래스이고 생성자의 접근 지정자가 protected라서 외부에서 new 연산자로 
	 * 객체를 생성 할 수 없고, 반드시 getInstance()메서드를 통해 객체를 생성하거나 
	 * Calendar클래스를 상속 받은 GregorianCalendar클래스를 이용해서 생성한 객체를 사용해야한다.  
	 */

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("올해 년도 : " + today.get(Calendar.YEAR));
		System.out.println("이번달 : " + (today.get(Calendar.MONTH)+1));
		System.out.println("년도기준 몇째주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월 기준 몇째주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일자 : " + today.get(Calendar.DATE));
		System.out.println("일자 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("년도 기준 날짜 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 (일:1) ~ (토:7) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("월기준몇째요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		/* 월과 요일은 get(Calendar.MONTH)의 리턴값은 1월인 경우 0을 리턴한다. 
		 * 12월은 리턴값이 11이 된다. 그리고 요일은 get(DAY_OF_WEEK)의 리턴값이 일요일부터 시작하고 1부터 시작한다. 
		 * 그래서 토요일은 7이 된다.
		 */
	}

}
