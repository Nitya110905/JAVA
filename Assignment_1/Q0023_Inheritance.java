package Assignment_1;

class Parent{
	public void parentmethod() {
		System.out.println("This is a parent class");
	}
}

class child extends Parent{
	public void childmethod() {
		System.out.println("This is a child class ");
	}
}
public class Q0023_Inheritance {
	public static void main(String[] args) {
		Parent p = new Parent();
		child c = new child();
		p.parentmethod();
		c.childmethod();
		c.parentmethod();
	}
}
