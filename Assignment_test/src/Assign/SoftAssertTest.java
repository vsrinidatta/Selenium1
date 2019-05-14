/**
 * 
 */
package Assign;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

/**
 * @author vsriniva
 *
 */
public class SoftAssertTest {
	private static final String True = null;
	String class_Name = "Soft_Hard_Assert";
	Assertion hardAssert = new Assertion();
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void hardAssertionMethod() {
		hardAssert.assertTrue(true == true);
		hardAssert.assertEquals("Soft_Hard_Assert", "Soft_Hard_Assert");
		hardAssert.assertEquals(class_Name, "Soft_Hard_Assert");
		System.out.println("hardAssertionMethod Passsed");
	}
	
	@Test
	public void SoftAssertionMethod() {
		softAssert.assertTrue(true == true);
		softAssert.assertEquals("Soft_Hard_Assert", "Soft_Hard_Assert");
		softAssert.assertEquals(class_Name, "Soft_Hard_Assert");
		System.out.println("SoftAssertionMethod Passsed");
		softAssert.assertAll();
	}
}
