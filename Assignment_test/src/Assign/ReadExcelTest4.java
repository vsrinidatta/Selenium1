/**
 * 
 */
package Assign;

/**
 * 3 Dimension Read Excel
 *
 */
public class ReadExcelTest4 {

	  public static void main(String[] args) 
	    { 
	  
	        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, 
	                          { { 5, 6 }, { 7, 8 } } };  /* 3 Dimsnal Array*/
	  
	        for (int i = 0; i < 2; i++) { 
	  
	            for (int j = 0; j < 2; j++) {  /*Nested for Loop*/
	  
	                for (int k = 0; k < 2; k++) {     /*Nested for Loop*/
	  
	                    System.out.print(arr[i][j][k] + " "); 
	                } 
	  
	                System.out.println(); 
	            } 
	            System.out.println(); 
	        } 
	    } 
	
	
}
