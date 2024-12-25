package Assignment_1;

abstract class p{
	abstract public void message();
	
	public static void parent() {
		System.out.println("This is parent class");
	}
}

class subclass1 extends p{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
		
	}
	
}


class subclass2 extends p{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
		
	}
	
}

public class Q0028_Abstraction {
	public static void main(String[] args) {
		subclass1 s1 = new subclass1();
		s1.message();
		p.parent();
		
		subclass2 s2 = new subclass2();
		s2.message();
		p.parent();
	}

}
