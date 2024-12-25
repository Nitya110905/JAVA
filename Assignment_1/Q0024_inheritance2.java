package Assignment_1;

class Member{
	String name,address;
	int age;
	long phone;
	float salary;
	public void salary() {
		System.out.println("Salary : " + salary);
	}
}

class Manager extends Member{
	String specialization,dept;
}

class Employee extends Member{
	String specialization,dept;
}

public class Q0024_inheritance2 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "John Doe";
		e.age = 30;
		e.phone = 124567890;
		e.address = "123 Main St"; 
		e.salary = 50000; 
		e.specialization = "Software Development";
		
		Manager manager = new Manager();
		manager.name = "Jane Smith";
		manager.age = 40;
		manager.phone = 987654321;
		manager.address = "456 Elm St";
		manager.salary = 75000;
		manager.dept = "IT";
		
		System.out.println("Employee Details:");
		System.out.println("Name: " + e.name);
		System.out.println("Age: " + e.age);
		System.out.println("Phone Number: " + e.phone);
		System.out.println("Address: " + e.address);
		System.out.println("Specialization: " + e.specialization);
		e.salary();
		
		System.out.println("\nManager Details:");
		System.out.println("Name: " + manager.name);
		System.out.println("Age: " + manager.age); 
		System.out.println("Phone Number: " + manager.phone);
		System.out.println("Address: " + manager.address);
		System.out.println("Department: " + manager.dept);
		manager.salary();
		
	}
}
