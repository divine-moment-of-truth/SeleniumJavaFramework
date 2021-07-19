package test;

import org.testng.annotations.Test;

public class Test17_TestNGDependencyDemo {

	// @Test(dependsOnMethods= {"test2", "test3"})
	@Test(dependsOnGroups = {"sanity.*"})
	public void test1() {
		System.out.println("I am inside test 1");
	}
	

	// @Test(priority=2)
	@Test(groups = {"sanity1"})
	public void test2() {
		System.out.println("I am inside test 2");
	}
	
	
	// @Test(priority=2)
	@Test(groups = {"sanity2"})
	public void test3() {
		System.out.println("I am inside test 3");
	}
	
}

