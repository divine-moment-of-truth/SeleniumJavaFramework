package test;

import org.testng.annotations.Test;

public class Test13_TestNGPriorityDemo {

	@Test(priority = 1)
	public void one() {
		System.out.println("I am inside test 1");
	}
	
	@Test(priority = 1)
	public void two() {
		System.out.println("I am inside test 2");
	}
	
	@Test(priority = 1)
	public void three() {
		System.out.println("I am inside test 3");
	}
}
