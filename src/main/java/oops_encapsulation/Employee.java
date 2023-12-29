package oops_encapsulation;

public class Employee {
	
	//Encapsulation and data hiding
	
	String name;
	int age;
	private int salary;
	private int bonus;
	private int ctc;
	
	public Employee(int salary) { // to intialize class level variables // setter
		this.salary = salary;
	}
	
	//getter and setters 
	public void setSalary(int salary) {
		
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	private void calculateTotalSalary() {
		ctc = salary + bonus;
	}
	
	public void getTotalSalary() {
		calculateTotalSalary();
	}
	
}
