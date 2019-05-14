package Assign;

import java.util.Scanner;

public class OperatorTest {

	
	   public static void main(String[] args) {
			/* input scanner  start  */
		   Scanner S = new Scanner(System.in); // creating scanner object to take input from the console//
		  
	        System.out.print("Enter the string you want to check:"); 
	        String     input = S.nextLine();
	        
	        /* input scanner  end  */
	        
	        
	/* object creation for method invoke start  */
	OperatorTest operatorTest= new OperatorTest();
	
	boolean ispalindrom=operatorTest.checkPalindrom(input);
	if(ispalindrom) {
		System.out.println("given input  is Palindrom");
	}else {
		System.out.println("given input  is  not Palindrom");
	}
	/* object creation for method invoke end  */
	
	}
	   
	   
	   /* method to check the palindrom for given string 
	    * Input : string
	    * OutPut: boolean
	    *  */
	   public  boolean checkPalindrom(String input) {
		   boolean result=false;
		   
		   StringBuilder builder=new StringBuilder();
			builder.append(input);
			builder.reverse();
			if(input.equals(builder.toString())) {
				result=true;
			}else {
				result=false;
			}
			return result;
	   }
}