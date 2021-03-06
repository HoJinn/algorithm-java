package studyJava01.Jinn;

import java.util.Date;

public class CalendarEx {

		public static void main(String[] args) {
		
			/*
			 * Date 클래스로 인스턴스를 생성하기 위해서는 두 가지 생성 방법이 존재.
			 * 1. 기본생성자로 사용하는 방법
			 * 2. Date(long date) 생성자를 사용하는 방법
			 */
			
			/* 1. 기본생성자 활용 */
			Date today = new Date();
	    
			/* toString()메소드가 오버라이딩 되어 있어서 쉽게 필드값(시간정보)를 출력해 볼 수 있다. */
			System.out.println(today.toString());
			
			/* 2. Date(long date) 생성자 활용 */
			System.out.println(today.getTime());		// 1626838608806
			/*
			 *  1970년 1월 1일 오전 9시 이후부터 현재 시간까지 몇초가 흘렀는지 알 수 있게 long형으로 반환해 준다.
			 */
	     
			Date time = new Date(1626838608806L);		// 컴퓨터는 정수를 대략 21억까지 인지하므로 L을 반드시 붙여서 long형으로 바꿔준다.
			
			System.out.println(time);
			
			/* 하루가 몇 milliseconds일까?
			 * 하루 = 24시간, 1시간 = 60분, 1분 = 60초, 1초 = 1000밀리초
			 * 1000 * 60 * 60 * 24 밀리초가 하루가 된다.
			 */		

		}
	}

