package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test08_Log4jDemo {

	private static Logger logger = LogManager.getLogger(Test08_Log4jDemo.class);
	
	public static void main(String[] args) {
		
		System.out.println("\n  Hello World..! \n");
		
		logger.trace("This is a trace message");
		logger.info("This is an information message");
		logger.error("This is an error message");
		logger.warn("This is a warning  message");
		logger.fatal("This is a fatal message");
		
		System.out.println("\n Completed");
		
	}
}
