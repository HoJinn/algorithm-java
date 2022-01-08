package studyJava01.Jinn;

public class StringEx {
		
	/* 
	 * 문자열 관련 메서드를 사용한 예제
	 */
	
	public static void main(String[] args) {
		
		String str = "Hello My Name is Choi Ho Jin";
		
		System.out.println(str.charAt(6 )); // 6번 인덱스의 문자 
		System.out.println(str.equals("Hello My Name is Choi Ho Jin")); //문자열값 비교 
		
		System.out.println(str.indexOf("Choi"));	// "Choi" 문자열의 위치  
		System.out.println(str.indexOf('C'));	// 'C'문자의 위치 
		System.out.println(str.substring(15));	// 15번 인덱스부터 끝까지 잘라낸다. 
		System.out.println(str.substring(6, 13)); // 6번 인덱스부터 13 전까지의 문자열 (12번 인덱스)
		
		System.out.println(str.toLowerCase());	// 소문자로 변경 
		System.out.println(str.toUpperCase());  // 대문자로 변경
		System.out.println(str.length());		// 문자열의 길이 
		System.out.println(str.startsWith("Hello")); // "Hello"으로 시작하는 지 여부 
		
		System.out.println(str.endsWith("Jin")); 	// "Jin" 으로 끝나는지 여부 
		
		System.out.println(str.replace("Choi", "Co")); // "Choi" 를 "Co"로 치환
		
		System.out.println(str.replaceAll("Name", "NickName")); //"Name"을 "NickName"으로 치환
		System.out.println(str.toString());
		
		str = "     안녕하세요,    반갑습니다.     ";
		System.out.println(str.trim()); // 앞뒤 공백 제거 
		
		// 모든 공백을 제거하는 방법 
		System.out.println(str.replace(" ", " "));
		
		str = String.valueOf(10); // 기본자료형 int를 문자열로 변환
		str = String.valueOf(10.5); // 기본자료형 double을 문자열로 변환 
		
		str = "홍길동,이순신,유관순,안중근";
		String[] arr = str.split(","); // ,를 구분자로 나눠서 배열로 리턴
		
		for (int i=0; i<arr.length; i++) { 
			System.out.println(i+ "번 인덱스 값 = " + arr[i]);
		}
	}

}
