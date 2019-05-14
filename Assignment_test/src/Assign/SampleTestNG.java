/**
 * 
 */
package Assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author vsriniva
 *
 */
@Test
public class SampleTestNG {
	
	public void verifyTitle () {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Gmail");
	}
	

}
