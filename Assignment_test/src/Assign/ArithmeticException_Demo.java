/**
 * 
 */
package Assign;

/**
 * @author vsriniva
 *
 */
public class ArithmeticException_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a=30, b=0;
			int c=a/b;
		    System.out.println("Result = " + c);	
		}
		catch (ArithmeticException e) {
		System.out.println("Cannot divide a number by 0");
	}

}

}
