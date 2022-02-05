package studyJava09.Generic;

import java.util.ArrayList;
import java.util.List;

	/* 
	 * 제네릭을 가장 많이 사용하는 컬렉션 프레임워크 클래스가 List(ArrayList),Map(HashMap)이다. 
	 * 먼저 ArrayList로 Member클래스의 객체를 생성해서 List에 배열형태 예제를 만들어 보자. 
	 */

public class MemberNoGeneric {
	
	public static void main(String[] args) {
		
		// 제네릭을 사용하지 않은 경우 
		List list = new ArrayList();
		
		Member mem1 = new Member();
		mem1.setName("홍길동");
		mem1.setId("hong");
		mem1.setPassword("hong1234");
		mem1.setAge(40);
		
		list.add(mem1); // 리스트에 추가
		
		Member mem2 = new Member(); 
		mem2.setName("이순신");
		mem2.setId("Lee");
		mem2.setPassword("lee1234");
		mem2.setAge(50);
		
		list.add(mem2); // 리스트에 추가
		
		Member mem3 = new Member();
		mem3.setName("김유신");
		mem3.setId("Kim");
		mem3.setPassword("kim1234");
		mem3.setAge(20);
		
		list.add(mem3);	// 리스트에 추가 
		
		// 리스트 갯수 
		System.out.println("list.size() : " + list.size());
		
		// 모든 리스트의 요소(Member) 강제형변화 후 출력 
		for (int i=0; i<list.size(); i++) { 
			System.out.println("인덱스 : " +i 
					+ ", 이름 : " +((Member)list.get(i)).getName()
					+ ", 아이디 : " + ((Member)list.get(i)).getId()
					+ ", 비밀번호 : " +((Member)list.get(i)).getPassword()		
					+ ", 나이 : " +((Member)list.get(i)).getAge());
		}
	}
}
