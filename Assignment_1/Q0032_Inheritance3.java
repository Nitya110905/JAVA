package Assignment_1;

class Shape{
	void print(){
		System.out.println("This is this shape");
	}
}

class Rect extends Shape{
	void printrect(){
		System.out.println("This is rectangular shape");
	}
}

class Circle extends Shape{
	void printcircle(){
		System.out.println("This is circular shape");
	}
}

class Sq extends Rect{
	void printsquare(){
		System.out.println("Square is a rectangle");
	}
}

public class Q0032_Inheritance3 {
	public static void main(String[] args) {
		Sq s = new Sq();
		s.print();
		s.printrect();
		s.printsquare();
	}
}
