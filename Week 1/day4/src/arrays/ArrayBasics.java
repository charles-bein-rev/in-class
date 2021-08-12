package arrays;

public class ArrayBasics {
	public static void main(String[] args) {
		int[] numArray = {0, 1, 1, 2, 3, 5};
		
		for(int i : numArray) {
//			System.out.println(i);
		}
		
		//Checking default array values for prims
		char[] charArray = new char[2];
		System.out.println(charArray[0]);
		int[] intArray = new int[2];
		System.out.println(intArray[0]);
		boolean[] boolArray = new boolean[2];
		System.out.println(boolArray[0]);
	}
}
