/*
 
Problem Statement:
Write a Java program to print the first N terms of the Fibonacci series.
The Fibonacci series is a sequence where each number is the sum of the two preceding ones, starting from 0 and 1.

*/
package logicBased;

import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms to print: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci series up to " + n + " terms: ");
        
        System.out.println();
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=n;i++) {
        	int c=a+b;
        	System.out.print(c+" ");
        	a=b;
        	b=c;
        }
        
	}

}
