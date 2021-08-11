package operators;

public class Unary {
	public static void main(String[] args) {
		int post = 10;
		System.out.println("Post Increment:");
		System.out.println(post);
		System.out.println(post++ + " " + post);
		System.out.println(post);

		int pre = 10;
		System.out.println("\n\nPre Increment:");
		System.out.println(pre);
		System.out.println(++pre);
		System.out.println(pre);

		boolean bool = false;
		System.out.println("\n\nNegation:");
		System.out.println(!bool);

	}
}
