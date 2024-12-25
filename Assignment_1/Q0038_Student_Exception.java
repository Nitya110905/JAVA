package Assignment_1;

import java.util.Scanner;

class AgeNotWithinRange_Exception extends Exception{
		public AgeNotWithinRange_Exception(String msg) {
			super(msg);
		}
	}
	
	class NameValid_Exception extends Exception{
		 public NameValid_Exception(String msg) {
			// TODO Auto-generated constructor stub
			super(msg);
		}
	}

class Student{
	int roll_no,age;
	String name,course;
	
	Student(int roll_no, int age, String name, String course){
		this.roll_no = roll_no;
		this.age = age;
		this.course = course;
		this.name = name;
	}
	
	public void age(int age) throws AgeNotWithinRange_Exception {
		if(15 >= age || age>=21) {
			throw new AgeNotWithinRange_Exception("Age is not valid");
		}
	}
	
	public void name(String name) throws NameValid_Exception {
		if(name.matches("[a-zA-Z]+")) {
			throw new NameValid_Exception("Name is Valid");
		}
		else {
			System.out.println("Name is not valid");
		}
	}
	
}

public class Q0038_Student_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int a = sc.nextInt();
		System.out.println("Enter Your name : ");
		String b = sc.next();
		Student s = new Student(a,14,b,"science");
		try {
			s.age(a);
			s.name(b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
