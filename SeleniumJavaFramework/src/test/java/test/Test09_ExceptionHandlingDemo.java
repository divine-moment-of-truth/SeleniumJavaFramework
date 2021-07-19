package test;

public class Test09_ExceptionHandlingDemo {
	public static void main(String[] args) {

		demo();
		
		try {
			demo2();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void demo() {	
		
		try {
			System.out.println("Hello world...!");
			int i = 1/2;
			System.out.println("Completed");
		}
		catch(Exception exp) {
			System.out.println("I am inside the catch block");
			System.out.println("Message is : " + exp.getMessage());
			System.out.println("Cause is : " + exp.getCause());
			exp.printStackTrace();
		}
		finally {
			System.out.println("I am in the final block");
		}
		
	}
	
	
	public static void demo2() throws Exception{

		System.out.println("Hello world...!");
		int i = 1/2;
		System.out.println("Completed");

	}
}
