package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.Test06_ExtentReportsWithTestNG;


public class PropertiesClassFile {

	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");	


	public static void main(String[] args) {
		getProperties();
		setProperties();
	}


	public static void getProperties() {

		try {

			// Get path of 'properties' file
			InputStream input = new FileInputStream(projectPath + "/src/test/java/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
					
			Test06_ExtentReportsWithTestNG.browserName = browser;

		} catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}

	public static void setProperties() {
		try {

			OutputStream output = new FileOutputStream(projectPath + "/src/test/java/config/config.properties");
			prop.setProperty("browser",  "chrome");
			prop.store(output,  null);
			
		} catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}


}
