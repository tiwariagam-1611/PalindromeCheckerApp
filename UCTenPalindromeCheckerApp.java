/* Use Case 10: Normalized Palindrome Validation

Description:
This class validates a palindrome after preprocessing
the input string.

Normalization includes:
- Removing spaces and symbols
- Converting to lowercase

This ensures the palindrome check is logical rather
than character-format dependent.

Example:
"A man a plan a canal Panama"

@author Developer
@version 10.0
*/

package com.palindromeapp;

public class UCTenPalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "A man a plan a canal Panama $ %";
		String normalized = input.strip().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		Boolean isPalindrome = true;
		for(int i=0;i<normalized.length()/2;i++) {
			if(normalized.charAt(i)!=normalized.charAt(normalized.length()-i-1)) {
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("The String given "+input+" is Palindrome");
		} else {
			System.out.println("The String given "+input+" is not Palindrome");
		}
	}

	
}
