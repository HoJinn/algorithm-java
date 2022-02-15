package studyJava10.Lambda;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

	/*
	 * Function 인터페이스는 매개변수와 리턴값이 모두 있는 추상 메서드 apply 를 가지고 있는 인터페이스 이다. 
	 * Function 인터페이스로 리턴값 매핑하여 학생 점수,합계,평균을 출력하는 예제를 만들어 보자.
	 * 
	 */

public class LambdaEx_05 {

	static Student[] list = { 
			new Student("홍길동", 90, 80, "컴공"), 
			new Student("이순신", 95, 70, "통계")
	};

	public static void main(String[] args) {
	
		System.out.print("학생명 : ");
		printString(t -> t.getName());
		System.out.print("전공 : ");
		printString(t -> t.getMajor());
		System.out.print("영어 점수 : ");
		printInt(t -> t.getEng());
		System.out.print("수학 점수 : ");
		printInt(t -> t.getMath()); 
		System.out.print("영어 점수 합계 : ");
		printTot(t -> t.getEng());
		System.out.print("수학 점수 합계 : ");
		printTot(t -> t.getMath()); 
		System.out.print("영어 점수 평균 : ");
		printAvg(t -> t.getEng());
		System.out.print("수학 점수 평균 : ");
		printAvg(t -> t.getMath());
		
	}
	static void printAvg(ToDoubleFunction<Student>f) { 
		double sum = 0;
		for (Student s : list) { 
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum / list.length);
	}
	
	static void printTot(ToIntFunction<Student>f) { 
		int sum = 0;
		for (Student s : list) { 
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	
	static void printInt(Function<Student, Integer> f) { 
		for (Student s: list) { 
			System.out.print(f.apply(s)+"");
		}
		System.out.println();
	}
	
	static void printString(Function<Student, String> f) { 
		for (Student s : list) { 
			System.out.print(f.apply(s)+" ");
		}
		System.out.println();
	}
	
}
