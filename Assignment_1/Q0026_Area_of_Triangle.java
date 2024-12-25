package Assignment_1;

class Triangle{
	int l=3,b=4,h=5;
	
	void perimeter() {
		System.out.println("Perimeter : " + (l + b + h));
	}
	
	void area() {
		System.out.println("Area : " + l*b*h);
	}
}

public class Q0026_Area_of_Triangle {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.perimeter();
		t.area();
	}
}
