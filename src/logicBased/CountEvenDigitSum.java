/*

Problem Title: Count Integers With Even Digit Sum

Problem Statement:
You are given a positive integer num. Your task is to count how many positive integers less than or equal to num have an even digit sum.
The digit sum of a number means the sum of all its digits.

You need to return the count of such numbers in the range [1, num]

Constraints:
1 <= num <= 1000

Example 1:

Input: num = 4
Output: 2

Explanation:

The numbers <= 4 with even digit sums are:
2 → (2)
4 → (4)
So, output is 2.

Example 2:

Input: num = 30
Output: 14

Explanation:

The numbers with even digit sums ≤ 30 are:
2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, 28

(Count = 14)

*/

package logicBased;
import java.util.Scanner;
public class CountEvenDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		int result = countNumbers(num);
		System.out.println("Totally "+ result +" numbers are there whose digits sum is even and less than or equal to "+ num +" .");
		
		sc.close();
	}
	
	public static int countNumbers(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(isEvenDigitSum(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isEvenDigitSum(int num) {
		int sum = 0;
		while(num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum % 2 == 0;
	}
}
