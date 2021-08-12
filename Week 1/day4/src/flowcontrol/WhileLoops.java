package flowcontrol;

public class WhileLoops {
	public static void main(String[] args) {
//		while(false) {
//			//Never happens
//		}
		
		while(true) {
			//happens forever
			break;
		}
		
		do {
			//happens once
		} while(false);
		
		do {
			//happens forever
			break;
		} while(true);
	}
}
