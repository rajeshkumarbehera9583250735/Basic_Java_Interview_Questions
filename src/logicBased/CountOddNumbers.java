/*

Problem Title: Count Odd Numbers in an Interval Range

Problem Statement:
You are given two non-negative integers low and high. 
Return the count of odd numbers between low and high (inclusive).

*/
package logicBased;
import java.util.Scanner;
public class CountOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number: ");
		int start = sc.nextInt();
		
		System.out.println("Enter the ending number: ");
		int end = sc.nextInt();
		
		int result = countOddNums(start, end);
		System.out.println("Total odd numbers between " + start + " to " + end + ": " + result);
        
		sc.close();
	}

	public static int countOddNums(int start, int end) {
		return ((end + 1 ) / 2 - (start / 2));
	}
}
