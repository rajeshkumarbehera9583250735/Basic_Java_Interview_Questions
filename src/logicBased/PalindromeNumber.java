/*

Problem Title: Palindrome Number

Problem Statement:
Given an integer x, return true if x is a palindrome, and false otherwise.
An integer is a palindrome when it reads the same backward as forward.

Could you solve it without converting the integer to a string?

*/
package logicBased;

public class PalindromeNumber {

	public static void main(String[] args) {
		int[] testCases = {121, -121, 1221, 0, 3, 69};
		for(int num: testCases) {
			System.out.println("Is "+ num +" a Palindrome Number ? "+ isPalindrome(num));
		}
	}
	
	public static boolean isPalindrome(int num) {
		if(num >= 0 && num < 10) return true;
		if(num < 0 || (num % 10 == 0) ) return false;
		
		int reversed = 0;
		while(num > reversed) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}
		
		return (num == reversed || num == reversed / 10);
	}

}
