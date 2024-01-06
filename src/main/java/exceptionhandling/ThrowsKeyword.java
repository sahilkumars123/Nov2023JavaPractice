package exceptionhandling;


public class ThrowsKeyword {
	
	public void m1() throws ArithmeticException  {
		System.out.println("m1");
		m2();
	}
	
	public void m2() throws ArithmeticException {
		System.out.println("m2");
		m3();
	}
	
	public void m3() throws ArithmeticException {
		System.out.println("m3");
		try {
		int i = 9/0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		System.out.println("hello");
		int i = 9/0;
		
//		catch(Exception e) {
//			e.printStackTrace();
//		}		System.out.println("hello");
//		}
	}


	public static void main(String[] args) {
		
		ThrowsKeyword th = new ThrowsKeyword();
		
		th.m1();
		
		System.out.println("bye");
	}

}
