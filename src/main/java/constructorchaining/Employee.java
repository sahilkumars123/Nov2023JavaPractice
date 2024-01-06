package constructorchaining;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	public Employee() {
		this("sahil",29);
		System.out.println("this is a default constructor");
	}
	
	public Employee(String name, int age) {
		this(name, age, 200000.00);
		this.name = "Mitaj";
		this.age = 35;
	}
	
	
	public Employee(String name, int age, double salary) {
		this.name = name; //sahil
		this.age = age; //29
		this.salary = salary; //200000.00
		
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		System.out.println("name is:: "+emp.name);
		System.out.println("age is:: "+emp.age);
		System.out.println("salary is:: "+emp.salary);
	}
	
	
	
}
