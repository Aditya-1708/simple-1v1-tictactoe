
public class main {
	public static void main(String [] args) {
		int counter=1;
		matrixGen m=new matrixGen();
		m.clear();
		m.initialize();
		System.out.println("             **WELCOME TO THE GAME OF TICTACTOE**");	
		m.display();
		m.inputplayers();
		m.clear();
		boolean didwin=false;
		while(didwin==false) {
			m.display();
			m.infocoordinates(counter);
			m.clear();
			if(counter>=5) {
				didwin=m.windecider();
			}
			counter++;
		}
	}
}
