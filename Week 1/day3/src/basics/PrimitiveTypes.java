package basics;

public class PrimitiveTypes {
	public static void main(String[] args) {
		byte b = (byte) 1000;
		System.out.println(b);
		short s = 110;
		System.out.println(s);
		int i = 120;
		System.out.println(i);
		long l = 200000000000L;
		System.out.println(l);

		float f = 3.14f;
		double d = 3.14;

		char c = 'C';

		boolean boolT = true;
		boolean boolF = false;

		int value = 1000;
		// implicit upcasting
		long bigger = value;

		// explicit downcasting
		long big = (int) 1000;

	}
}
