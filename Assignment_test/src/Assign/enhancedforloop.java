/**
 * 
 */
package Assign;

/**
 * @author vsriniva
 *
 */
public class enhancedforloop {

	   public static void main(String args[]) 
	    { 
	        String array[] = {"Selllabs", "is", "in", "4th floor"}; 
	  
	        //enhanced for loop 
	        for (String x:array) 
	        { 
	            System.out.println(x); 
	        } 
	  
	       // for loop for same function 
	        for (int i = 0; i < array.length; i++) 
	        { 
	            System.out.println(array[i++]); 
	        } 
	        
	    } 
	
}
