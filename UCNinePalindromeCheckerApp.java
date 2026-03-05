/* Use Case 9: Recursive Palindrome Checker

Description:
This class validates a palindrome using recursion.

Characters are compared from the outer positions
moving inward using recursive calls.

The recursion stops when:
- All characters are matched, or
- A mismatch is found.

This use case demonstrates divide-and-conquer
logic using method recursion.

@author Developer
@version 9.0
 */


package com.palindromeapp;

public class UCNinePalindromeCheckerApp {
	public static void main(String[] args) {

		String input = "Radar";
		System.out.println("Input: " + input);

		boolean isPalindrome = isPalindrome(input, 0, input == null ? -1 : input.length() - 1);
		System.out.println("Is Palindrome? : " + isPalindrome);

	}

	private static boolean isPalindrome(String s, int start, int end) {
		if (s == null) return false;    
		if (start >= end) return true;        

		if (s.charAt(start) != s.charAt(end))
			return false;

		return isPalindrome(s, start + 1, end - 1);
	}
}
