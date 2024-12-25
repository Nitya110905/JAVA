package Assignment_1;


class rectangle{
	 int l,b;
	 
	 rectangle(int l, int b){
		 this.l = l;
		 this.b = b;
	 }
	
	 void perimeter() {
		System.out.println("Perimeter is : " + 4*(l+b));
	}
	
	 void area() {
		System.out.println("Area is : " + l*b);
	}
}

class square extends rectangle{
	
	 square(int s) {
		super(s, s);
		// TODO Auto-generated constructor stub
	}

	void perimeter() {
		System.out.println("Perimeter is : " + 4*l);
	}
	
	public void area() {
		System.out.println("Area is : " + l*l);
	}
}
public class Q0025_Area2 {
	public static void main(String[] args) {
		rectangle r = new rectangle(5, 7);
		r.area();
		r.perimeter();
		
		square s = new square(9);
		s.perimeter();
		s.area();
	}
}
