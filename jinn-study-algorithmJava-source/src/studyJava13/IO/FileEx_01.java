package studyJava13.IO;

import java.io.File;

public class FileEx_01 {

	/* 
	 * File클래스 
	 * 바이트, 문자 기반 스트림 외에 파일의 경로나 파일정보를 확인하고, 웹사이트의 첨부파일을 업로드 할때도 사용되는 클래스 이다. 
	 * 파일 경로는 생성자를 통해 전달한다. 파일에 대한 정보중에서도 파일의 존재여부,파일의 크기 그리고 마지막 수정날짜는 
	 * 애플리케이션을 만들때 빈번히 사용되므로 반드시 숙지해야한다. 
	 */
	public static void main(String[] args) {
		
		File file =new File("text4.txt");
		
		// 파일인지 여부 
		System.out.println(file.isFile());
		// 디렉토리인지 여부 
		System.out.println(file.isDirectory());
		// 파일명 
		System.out.println(file.getName());
		// 파일 절대경로명 
		System.out.println(file.getAbsolutePath());
		// 생성자에 넣어준 경로 
		System.out.println(file.getPath());
		// 읽기권한 있는지 여부 확인 
		System.out.println(file.canRead());
		// 쓰기권한 있는지 여부 확인 
		System.out.println(file.canWrite());
		
		
	}

}
