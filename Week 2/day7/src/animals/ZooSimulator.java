package animals;

public class ZooSimulator {
	public static void main(String[] args) {
		Lion l = new Lion();
		Penguin p = new Penguin();
		
		Animal animals[] = {l, p};
		
		for(Animal a : animals)
			a.funFact();
	}
}
