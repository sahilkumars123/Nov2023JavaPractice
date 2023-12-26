package staticconcept;

public class A {
	
//infinite calling
	
	public static void main(String[] args) {
		
		System.out.println("A- main");
		B.main(args);

	}

}
