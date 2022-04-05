package studyJava00.Test;

import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		/*
		 *	BMI(신체질량지수)를 계산하고, 계산된 값에 따라 
		 *	저체중,정상체중,과체중,비만을 출력해보자. 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("키를 입력하세요(cm) : ");
		float height = sc.nextFloat() / 100;
		
		System.out.print("몸무게를 입력하세요(Kg) : ");
		float weight = sc.nextFloat();

		float bmi = weight / (height * height);
		String result = "";

		if(bmi < 20){
			result = "저체중";
		} else if(bmi < 25){
			result = "정상체중";
		} else if(bmi < 30){
			result = "과체중";
		} else {
			result = "비만";
		}
		
		System.out.println("당신은 " + result + " 입니다.");
		
		sc.close();
	}
	
}