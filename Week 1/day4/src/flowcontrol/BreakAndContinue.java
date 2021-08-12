package flowcontrol;

public class BreakAndContinue {
	public static void main(String[] args) {
		char character = 'a';

		for(int i = 0; i < 5; i++) {
			for(character = 'a'; character < 'z'; character++) {
				if(character == 'b')
					continue;
				else if(character == 'e')
					break;
				System.out.println(i + " " + character);
			}
		}
	}
}
