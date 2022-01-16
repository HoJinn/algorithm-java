package studyJava07.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderEx_02 {

	/* Calendar클래스를 상속 받아 구현한 GregorianCalendar 클래스를 이용하여 날짜간의 일수를 구해보자 */ 
	public static void main(String[] args) {
		
		//현재일 
		int sYear = 2022; 
		int SMonth = 1; 
		int sDay = 16;
		
		//이전일 
		int eYear = 2022;
		int eMonth = 1; 
		int eDay = 10; 
		
		Calendar sCal = new GregorianCalendar(sYear, eMonth+1, sDay);
		Calendar eCal = new GregorianCalendar(eYear, eMonth+1, eDay);
		
		long diffSec = (sCal.getTimeInMillis()-eCal.getTimeInMillis())/1000;
		
		long diffDay = diffSec / (24*60*60); 
		
		System.out.println(diffDay + "일 경과");
	
	}

}
