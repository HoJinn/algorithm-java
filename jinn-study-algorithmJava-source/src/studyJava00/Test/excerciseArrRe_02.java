package studyJava00.Test;

public class excerciseArrRe_02 {
	
	// 배열에 담긴 점수들의 합계점수와 평균점수를 출력하는 코드를 완성하시오.(복습) 
		public static void main(String[] args) {
			
			int[] score = {10, 30, 20, 60, 80, 100} ;
			
			int totalScore = 0; 
			double avgScore = 0; 
			
			for (int i=0; i<score.length; i++) { 
				totalScore += score[i];
			}
			avgScore = (double)totalScore / score.length;
			System.out.println(totalScore);
			System.out.println(avgScore);
		}
	}