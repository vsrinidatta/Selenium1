/**
 * 
 */
package Assign;

/**
 * @author vsriniva
 *
 */
public class privateConstructor {
	  private static privateConstructor instance;
	   private privateConstructor(){}
	 
	   public static privateConstructor getInstance(){
	      if(instance == null){
	         instance = new privateConstructor();
	      }
	      return instance;
	   }
	 
	   public static void main(String[] args) {
		   privateConstructor tester = privateConstructor.getInstance();
		   privateConstructor tester1 = privateConstructor.getInstance();
	      System.out.println(tester.equals(tester1));
	   } 

}
