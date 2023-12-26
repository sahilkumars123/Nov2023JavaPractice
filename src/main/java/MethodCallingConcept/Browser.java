package MethodCallingConcept;

public class Browser {

	public void b1() {
		System.out.println("b1 method");
		b2();
		Employee.t1();
	}

	public void b2() {
		System.out.println("b2 method");
		b3();
	}

	public void b3() {
		System.out.println("b3 method");
	}

	public static void main(String[] args) {
		
		Browser browser = new Browser();
		browser.b1();

	}

}
