package MahavatarBabaji;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MvnseleniumTest {

	@Test
	public void seleniumtest()
	{
		System.out.println("Selenium test with maven");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
	}
}

// groupid will be test package name and artifact id will be project name
//POM.xml is heart of maven
// main folder will have all utilities and test will have test cases
// surefire plugin is used to run all test cases
//mvn eclispse:eclipse is used to integrate maven project with eclipse, it will generate two files in maven project folder
//import project to eclipse
//Central repository, skeltal structure, cont integration, plugins
//Use Test keyword in end of class name so that maven recognize
//add dependicies like slenium and testng jars to use in pom and surefire plugin
//mvn clean,mvn compile,mvn test-it will run all test cases from command prompt and no need to do right click run as testng or even open eclipse
//mvn -Dtest=TestCircle test for running single test
//configure testng xml file in pom surefire plugin section to execute all packages, otherwise mvn test will execute only package
// configure profile in pom.xml and give particular testng xml file there and execute with mvn test -Pprofilename then only tests mentioned in that xml will execute 


