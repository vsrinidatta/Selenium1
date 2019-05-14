/**
 * 
 */
package Assign;

import org.testng.annotations.Test;

/**
 * @author vsriniva   1234567676
 *
 */
public class AnotherTstNg {
	
	public void logIn() {
		System.out.println("Login successful..");
	}
	
	@Test (priority = 2)
	public void search () {
		System.out.println("Search operation successful....");
	}

	@Test (priority = 3)
	public void logOut() {
		System.out.println("LogOut Successfull....");
	}
}
