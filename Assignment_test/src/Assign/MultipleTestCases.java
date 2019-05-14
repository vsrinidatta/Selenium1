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
public class MultipleTestCases {
	
	@Test
	public void testA () {
	Assert.assertEquals ("Google", "Google");
}
	@Test
	public void testC () {
	Assert.assertEquals ("Gmail", "Gmail");
}
	@Test
	public void testB () {
	Assert.assertEquals ("Yahoo", "Yahoo");
}
}