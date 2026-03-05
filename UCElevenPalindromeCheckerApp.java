/* Use Case 11: Object-Oriented Palindrome Service

Description:
This class demonstrates palindrome validation using
object-oriented design.

The palindrome logic is encapsulated inside a
PalindromeService class.

This improves:
- Reusability
- Readability
- Separation of concerns

@Author Developer
@Version 11.0
*/

package com.palindromeapp;

public class UCElevenPalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "radar";
		PalindromeService pls = new PalindromeService();
		if(pls.checkPalindrome(input)) {
			System.out.println("\"" + input + "\" is a palindrome.");
		} else {
			System.out.println("\"" + input + "\" is NOT a palindrome.");
		}
		
	}
}

class PalindromeService{
	public boolean checkPalindrome(String input) {
		int start = 0;
		int end = input.length()-1;
		boolean isPalindrome = true;
		while(start < end) {
			if(input.charAt(start)!=input.charAt(end)) {
				isPalindrome = false;
			}
			start++;
			end--;
		}
		return isPalindrome;
	}
}
