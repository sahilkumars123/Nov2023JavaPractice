package oops_inheritance;

public class Car extends Vehicle {

	public void start() {
		System.out.println("Car---start");
	}

	public void stop() {
		System.out.println("Car---stop");
	}

	public void refuel() {
		System.out.println("Car---refuel");
	}

	public static void billing() {
		System.out.println("car-billing");
	}

	private void testing() {
		System.out.println("Car---testing");
	}

	public final void power() {
			System.out.println("car --- power");
	}
	
	public final static void ABS() {
		System.out.println("car --- power");
}
}
