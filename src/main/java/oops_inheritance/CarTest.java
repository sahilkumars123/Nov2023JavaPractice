package oops_inheritance;

public class CarTest {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.stop(); //inherited method
		b.refuel(); //inherited method
		b.autoParing(); //individual method
		b.start(); // BMW - start
		b.engine();
		
		
		Car.billing(); //Car - billing
		BMW.billing(); //Car - billing
		
		b.power(); //car - power
		
		
		//b.safety();
		
		System.out.println("---------------------------------");
		
		//float a = (float) 12;  -- typecasting
		
		Car c = new Car();
		c.start(); //individual methods
		c.stop();
		c.refuel();
		c.engine();
		//c.safety
		
		System.out.println("---------------------------------");
		
		//WebDriver driver = new ChromeDriver();
		
		// Top-Casting concept
		Car cb = new BMW();
		
		cb.start(); // Start - BMW
		cb.stop();
		cb.refuel();
		//cb.autoparking() -  parent doen't know that child has its own individual methods and hence it cannot call it
		cb.engine(); 
		
		
		System.out.println("---------------------------------");
		
		//downcasting
//		BMW bw = (BMW) new Car(); // java.lang.ClassCastException: class oops_inheritance.Car cannot be cast to class oops_inheritance.BMW (oops_inheritance.Car and oops_inheritance.BMW are in unnamed module of loader 'app')                       //at oops_inheritance.CarTest.main(CarTest.java:38)
//		bw.start(); //BMW- start
//		//bw.stop();
//		//bw.refuel();
//		//bw.autoParing(); 
		
		
		System.out.println("---------------------------------");
		
		//topcasting
		Vehicle v =new BMW();
		
		//1. it will also call its own methods
		//2. if the overriding is there - so it will call the child class method
		v.engine(); //---BMW engine
		v.streo();  //Vehicle streo
		
		
		//BMW bw2 = new Vehicle();

		
		Car cb2 = new Audi();
		
		cb2.start(); //Audi---start
		cb2.stop();  //Car --stop
		cb2.refuel();
		cb2.streo();
		cb2.engine();
		
		
		
		BMW.ABS();
		Car.ABS();
		
	
		
		
		
		
		
		
	}

}
