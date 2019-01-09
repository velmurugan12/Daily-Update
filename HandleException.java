package com.exception;

import java.util.Scanner;

public class HandleException {
	static void experience() 
	{
		Scanner s = new Scanner(System.in);
    	System.out.println("enter the experience in years:");
    	int n = s.nextInt();
    	System.out.println("Your experience is:" +n);
		if(n<10)
		{
    
   try{
        throw new ArithmeticException("For post of director"); 
        
        
   }catch(ArithmeticException e){System.out.println("not eligible");}
   
   finally
   {
   System.out.println("Exception Handled");
   }
   
      
		}
		else 
			System.out.print("you are eligible");
		
	}	


  public static void main(String[] args) 
{ 
   
        experience();
    
 } 

}
