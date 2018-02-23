package Log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GeneratingLogs {
	
	@Test
	public void TestLogging()
	{
		Logger log=Logger.getLogger("GeneratingLogs"); //pass the class Name as a parameter , dont include.java extention
		PropertyConfigurator.configure("D:\\10 jan batch\\Selenium\\src\\Log4J\\Log4j.properties"); // we are configuring our logger for "Log4j.properties"
		
		log.info("opening the browser");
		
		WebDriver driver = new FirefoxDriver();
		log.info("firefox opened");
		
		driver.get("http://www.google.com");
		log.info("website opened sucesfully");
		
		
		
	}

}
