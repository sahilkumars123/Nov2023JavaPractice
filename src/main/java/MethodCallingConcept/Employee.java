package MethodCallingConcept;

public class Employee {

	public static void t1() {
		System.out.println("t1");
		Employee.t2();
	}

	public static void t2() {
		System.out.println("t2");
		Employee.t3();
	}

	public static void t3() {
//		Browser browser = new Browser();
//		browser.b3();
		System.out.println("t3");
	}


	
	public static void main(String[] args) {
		//Employee emp = new Employee();
		
		Employee.t3();
	}

}
