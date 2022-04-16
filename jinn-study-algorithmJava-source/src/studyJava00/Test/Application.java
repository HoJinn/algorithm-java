package studyJava00.Test;

public class Application {	
	
	public static void main(String[] args) {
		
//		System.out.println(excerciseInt03.Coin());
//		System.out.println(excerciseInt03.rockPaperScissors());
//		System.out.println(excerciseInt03.randomAlphabet(8));
//		System.out.println(excerciseInt03.LowerAlphabet(8));
		
		Calculator calculator = new Calculator(); 
		
		System.out.println("1부터 10까지의 합 : "  + calculator.sum1to10());
	
		calculator.checkMaxNumber(10, 20, 2);
		System.out.println("10과 20의 합은 : " + calculator.sumTwoNumber(10, 20));
		System.out.println("10과 5의 차는 : " + calculator.minusTwoNumber(10, 5));
	}

}
