package MahavatarBabaji;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mvnselenium2Test {


	   @Test
		public void seleniumtest2()
		{
			System.out.println("Selenium test with maven 2");
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://yahoo.com");
		}
	   
	   /*
	    Maven is software project mgmt tool and build mgmt tool
Maven suggest templates hence common structure
Central repository, projects can be easily transferred
src--main--data usable, utilites
src--test--test cases
Integration with jenkins
Environment variable --MAVEN_HOME--maven software home path
Path variable--Maven/bin
cmd mvn --version
Groupid-uniquely identifies project
artifact id-stand as a project name
provide groupid and artifact id to clone a project in local
mvn archetype:generate -DgroupId=qaclickacademy -DartifactID=MavenJava -DarchetypeArtifactID=maven-archetype-quickstart -DintaeractiveMode=false
cd MavenJava>mvn eclipse:eclipse (To integrate maven project in eclipse if project created from cmd)
Eclipse comes with maven plugin,go to windows pref then user setting,.m2 folder will have repository where it will keep jars
File->Import->Maven->Existing Maven Project
POM.xml has dependencies
\MavanJava>mvn clean, mvn compile-will check syntax,mvn test
Put Test in the end of each class file in maven project if you want maven to recognize it
Integrate testng xml file with maven, for that provide testng dependencies in POM.xml and 
Inside surefile plugin there is configuration tag which you need to add and you can pass testng.xml files here, then mvn test will execute from testng.xml otherwise from project level which has all classes. Hence control execuetion by executing from testng.xml
MavanJava>mvn -Dtest=SeleniumTest test-Running a single test
<Profiles><Profile><id>Regression</id>(Build part)</Profiles></Profile>-each profile can have diff testng xmls
Now from cmd MavenJava>mvn test -PRegression
	    */
}
