package studyJava01.Jinn;

public class ClassEx_01 {

	public static void main(String[] args) {
		
		ClassB cd = new ClassB(); 
		cd.print(); 
	}
	public void print() { 
		System.out.println("여기는 ClassA");
	}
}
class ClassB{ 
	void print() { 
		System.out.println("여기는 ClassB");
	}
}
