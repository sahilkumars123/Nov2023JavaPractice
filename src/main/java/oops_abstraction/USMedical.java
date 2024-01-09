package oops_abstraction;


//method has no body
	// only method declaration/method prototype
	// no buss logic
	// abstract methods


//100% Abstraction


//0% Abstarction - 

//100% Abstarction 


// 0 to 100%

public interface USMedical extends WHO {
	
	public final int min_fee = 10; 
	
	//static in nature
	//final in nature
		
	//abstraction - hiding the details
	
	public void physioServices();  //abstract methods - donot have a body
	
	public void cardioServices();
	
	public void ENTservices();
	
	public void emergencyServices();
	
	//contructor is not possible in interface
	
//After JDK 1.8 few changes were introduce :: 
	//After java 18
	//1. can have static method with method body(buss logic). --- can only be called by class name and these 
	//methods are not inherited as well.
	
//	public static void USMedPharamacy() {
//		System.out.println("US Med Pharamacy");
//	}
//	
//	public static void USMedPharamacy(int a) {
//		System.out.println("US Med Pharamacy");
//	}
//	
	//2. can have a default method (non static) with method body
	default void billing() {
		System.out.println("US Medical --- billing");
	}

}
