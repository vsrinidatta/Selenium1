/**
 * 
 */
package Assign;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author vsriniva
 *
 */
public class TestDependsOntestng {
	
	@Test
	public void logIn() {
		System.out.println("Login Successful....");
	}
	
   @Test (dependsOnMethods = {"logIn"}) /*HardDependency*/
   	public void Search() {
	   Assert.assertEquals("abc", "abc");
	    }
   
   @Test (dependsOnMethods = {"Search"}, alwaysRun = true)  /*SoftDependency*/
   public void logOut () {
	   System.out.println("Logout successful....");
   }
   }
