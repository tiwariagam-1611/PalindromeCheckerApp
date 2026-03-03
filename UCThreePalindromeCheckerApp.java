/*
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

package com.palindromeapp;

public class UCThreePalindromeCheckerApp {
	public static void main(String[] args) {
		String original = "MadaM";
		System.out.println("Original String "+original);

		String reverse="";
		for(int i=original.length()-1;i>=0;i--) {
			reverse+=original.charAt(i);
		}
		System.out.println("Reverse String "+reverse);
		if(original.equals(reverse)) {
			System.out.println("The String given "+original+" is Palindrome");
		} else {
			System.out.println("The String given "+original+" is not Palindrome");
		}
		
	}
}
