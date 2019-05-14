/**
 * 
 */
package Assign;

/**
 * @author vsriniva
 *
 */
public class NullPntrException {

	private static String a;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			a = null;
			System.out.println(a.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException...");
		}

	}

}
