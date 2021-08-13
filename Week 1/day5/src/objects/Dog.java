package objects;

public class Dog {
	public String name;
	public String breed;
	public int age;
	public double weight;
	
	public Dog() {
		this("No name", "No breed", 0, 0.0);
	}
	
	public Dog(String name) {
		this(name, "No breed", 0, 0.0);
	}
	
	public Dog(String name, String breed) {
		this(name, breed, 0, 0.0);
	}
	
	public Dog(String name, int age) {
		this(name, "No breed", age, 0.0);
	}
	
	public Dog(String name, String breed, int age) {
		this(name, breed, age, 0.0);
	}
	
	public Dog(String name, double weight) {
		this(name, "No breed", 0, weight);
	}
	
	public Dog(String name, String breed, double weight) {
		this(name, breed, 0, weight);
	}
	
	public Dog(String name, String breed, int age, double weight) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}
}
