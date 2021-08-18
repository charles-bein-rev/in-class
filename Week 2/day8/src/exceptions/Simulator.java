package exceptions;

public class Simulator {
	public static void main(String[] args) {
		try {
			sumOddNumbers(1, 2);
		} catch (EvenNumberException e) {
			e.printStackTrace();
		}
	}

	public static int sumOddNumbers(int n1, int n2)
		throws EvenNumberException{

		if (n1 % 2 == 0)
			throw new EvenNumberException("First input was even");
		if (n2 % 2 == 0)
			throw new EvenNumberException("Second input was even");

		return n1 + n2;
	}
}
