package flowcontrol;

public class ForLoops {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			//Runs 5 times
		}
		
		int[] array = new int[5];
		for(int j : array) {
			//Also runs 5 times, once per array element
		}
	}
}
