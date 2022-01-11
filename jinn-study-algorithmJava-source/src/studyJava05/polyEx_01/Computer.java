package studyJava05.polyEx_01;

public class Computer {

	public static void main(String[] args) {
		
		GraphicCard gc = new GraphicCard();
		gc.process(); //기존 그래픽카드 process
		
		gc = new Amd(); 
		gc.process();
		
		gc = new Nvidia();
		gc.process();
	}

}
