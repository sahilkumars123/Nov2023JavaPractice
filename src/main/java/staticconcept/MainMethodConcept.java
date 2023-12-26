package staticconcept;

public class MainMethodConcept {

	// calling purpose
	// no buisness logic written
	// no return from main method
	// CMA
	// no need to create an object for it. --- ///JVM ----MainMethodConcept.main();
	// main method can be overloaded - it is possible

	static int a = 10;

	public static void A() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {

		System.out.println("Hi");
		MainMethodConcept.main(20);
		MainMethodConcept.main(20,30);
	}

	public static void main(int a) {

		System.out.println("Hello");
	}

	public static void main(int a, int b) {

		System.out.println("Hello Sahil");
	}

}
