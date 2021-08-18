package animals;

public class Penguin extends Animal{
	
	public Penguin() {
		super();
	}

	public Penguin(String name, int age, double weight) {
		super(name, age, weight);
	}

	public void funFact() {
		System.out.println("This is a penguin fact");
	}
}
