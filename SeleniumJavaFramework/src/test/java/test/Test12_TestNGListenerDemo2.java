package test;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class Test12_TestNGListenerDemo2 {

	
	@Test
	public void test4() {
		System.out.println("I am in test 4");
	}
	
	
	@Test
	public void test5() {
		System.out.println("I am in test 5");
	}
	
	
	@Test
	public void test6() {
		System.out.println("I am in test 6");
		throw new SkipException("This test is kipped");
	}
}
