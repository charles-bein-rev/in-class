package encap.two;

import encap.one.Parent;

public class Child extends Parent {
	public void printParentStrings() {
			Parent p = new Parent();
			System.out.println(p.pub);
			System.out.println(p.pro);
			System.out.println(p.def);
			System.out.println(p.pri);
	}
	
	public void printMyStrings() {
		System.out.println(this.pub);
		System.out.println(this.pro);
		System.out.println(this.def);
		System.out.println(this.pri);
	}
}
