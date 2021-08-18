package animals;

public class Lion extends Animal {
	public Lion() {
		super();
	}

	public Lion(String name, int age, double weight) {
		super(name, age, weight);
	}

	public void funFact() {
		System.out.println("This is a lion fact");
	}
}
