package animals;

public abstract class Animal {
	String name;
	int age;
	double weight;
	
	public Animal() {
		
	}
	
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void funFact() {
		System.out.println("General animal fact");
	}
}
