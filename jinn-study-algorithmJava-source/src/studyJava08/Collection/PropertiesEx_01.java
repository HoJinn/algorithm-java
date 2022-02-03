package studyJava08.Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx_01 {
	
	/* 
	 * Properties클래스는 Hashtable 클래스의 하위 클래스이다. 
	 * key와 value 가 모두 String인 Map객체이며 이 Properties클래스는 자바 프로그램에서 설정파일용으로 많이 사용한다. 
	 * 
	 * 자바 파일에 직접 서버정보나 DB정보등을 저장해두면 설정이 바뀌는 자바 파일을 다시 열어 수정하고 컴파일해서 배포해야되는 번거로움이 있다. 
	 * 그래서 property 파일을 따로 만들어서 관리하기도 한다. 
	 */
	
	public static void main(String[] args) {
		
		try { 
			Properties pr = new Properties(); 
			
			// properties 파일 읽어오기 
			FileInputStream reader = new FileInputStream("C:/jinn-study-algorithmJava-source/src/studyJava08/Collection/"+"config.properties");
			
			// Properties 객체에 로드 
			pr.load(reader); 
			System.out.println(pr);
			System.out.println("이름 : " + pr.getProperty("name"));
			
			// property에 키 값으로 추가하기 
			pr.put("subject", "자바");
			System.out.println(pr);
			
			// properties 파일로 출력 
			pr.store(new FileOutputStream("C:/jinn-study-algorithmJava-source/src/studyJava08/Collection/" + "test.properties"), "#save");
		} catch (IOException e) { 
			System.out.println(e.getMessage());
		}
		
		/*
		 * properties파일을 읽어 들일 대 경로는 pc에 설정한 workspace경로와 맞춰서 작성해야 한다. 
		 * FileInputStream클래스를 이용해 config.properties파일을 읽어 온후 Properties객체에 로드하면 Map객체처럼 key값으로 value를 조회할 수 있다.
		 */
	}

}
