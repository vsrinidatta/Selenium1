/**
 * 
 */
package Assign;

public class primeNumbereTest {
	public static void main (String[] args)
	   {		

		primeNumbereTest primenum= new primeNumbereTest();
		primenum.checkPrimeNumber(5);
		   }
	   
	public void checkPrimeNumber(int prime) {
	       int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";
/**		for (i = 1; i <= 20; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       } **/
	       int counter=0;
	       for (int j = 1; j<=prime; j++) {
	    	 
	           if(prime%j==0)
			     {
		 		counter = counter + 1;
			     }
			  }
			  if (counter ==2)
			  {
			     //Appended the Prime number to the String
			     primeNumbers = primeNumbers + i + " ";
			     System.out.println("Given Number is prime number");
			  }	
			  else {
				 System.out.println("Given Number is not a prime number");
			  }
			  }
	
	      	}

