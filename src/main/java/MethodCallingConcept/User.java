package MethodCallingConcept;

public class User {
	
	
	public void u1() {
		System.out.println("u1");
		//u2();
		User.t1();
	}

	public void u2() {
		System.out.println("u2");
		u3();
	}

	public void u3() {
		System.out.println("u3");
	}
	
	
	public static void t1() {
		System.out.println("t1");
		//User.t1();
		
	}

	public static void t2(User user2) {
		System.out.println("t2");
		//User.t2();
//		User user2 = new User();
//		user2.u2();
		user2.u2();
	}

	public static void search(User user2) { //user2 = user
		System.out.println("t3");
		user2.u3();
		
	}

	public static void main(String[] args) {

		User u1 = new User();
		//user.u1();
		//u1=u2;
		
		//u1.u1(10); //call by value
		
		User.search(u1); //call by reference
		User.t2(u1);
		
	}

}
