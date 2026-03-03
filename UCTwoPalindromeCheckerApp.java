package com.palindromeapp;

import java.util.Scanner;

/*
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */



public class UCTwoPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String string = sc.next();
		Boolean isPalindrome = true;
		for(int i=0;i<string.length()/2;i++) {
			if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("The String given "+string+" is Palindrome");
		} else {
			System.out.println("The String given is not Palindrome");
		}
		sc.close();

	}
}


