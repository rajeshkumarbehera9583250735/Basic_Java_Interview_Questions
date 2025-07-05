/*

Problem: Write a Java program to find the factorial of a given number.

*/
package logicBased;

import java.util.Scanner;

public class FactorialOfEachDigit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter a number: ");
	     int num = sc.nextInt();
	     
	     while(num>0) {
	    	 int fact=1;
	    	 int digit=num%10;
	    	 
	    	 for(int i=1;i<=digit;i++) {
	    		 fact=fact*i;
	    	 }
	    	 System.out.println("Factorial of " + digit + " is = " + fact);
	    	 num=num/10;
	     }
	     sc.close();
	}
}
