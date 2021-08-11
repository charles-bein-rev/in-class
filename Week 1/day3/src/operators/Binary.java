package operators;

public class Binary {
	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		int z = 2;
		System.out.println(x % y);
		System.out.println(x % z);
		
		//instance of operator
		Unary test = new Unary();
		System.out.println(test instanceof Object);
	}
}
