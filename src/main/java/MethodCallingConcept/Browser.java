package MethodCallingConcept;

public class Browser {

	public void b1() {
		System.out.println("b1 method");
		b2();
	}

	public void b2() {
		System.out.println("b2 method");
		b3();
		Employee.t2();
	}

	public void b3() {
		System.out.println("b3 method");
		Employee.t3();
	}
	
	

	public static void main(String[] args) {
		
		Browser browser = new Browser();
		browser.b1();

	}

}
