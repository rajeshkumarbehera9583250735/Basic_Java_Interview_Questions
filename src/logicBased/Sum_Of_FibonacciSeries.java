/*
  
Problem: 
Write a Java program to print the first N Fibonacci numbers starting from 0 and 1, and also print their sum.

*/
package logicBased;

import java.util.Scanner;
public class Sum_Of_FibonacciSeries {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter how many Fibonacci numbers to print: ");
	     int num = sc.nextInt();
	     int a=0, b=1;
	     System.out.print("Fibonacci Series: "+a+" "+b+" ");
	     int sum=a+b;
	     
	     for(int i=3;i<=num;i++) {
	    	 int c=a+b;
	    	 System.out.print(c+" ");
	    	 sum = sum+c;
	    	 a=b;
	    	 b=c;
	     }
	     
	     System.out.println("\nSum of Fibonacci series: " + sum);
	     sc.close();
	}

}
