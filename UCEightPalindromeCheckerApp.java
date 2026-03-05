/* Use Case 8: Linked List Based Palindrome Checker

Description:
This class checks whether a string is a palindrome
using a LinkedList.

Characters are added to the list and then compared
by removing elements from both ends:

- removeFirst()
- removeLast()

This demonstrates how LinkedList supports
double-ended operations for symmetric validation.

@author Developer
@version 8.0
*/
package com.palindromeapp;

import java.util.*;

public class UCEightPalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "radar";
		LinkedList<Character> ll = new LinkedList<>();
		for(char ch : input.toCharArray()) {
			ll.add(ch);
		}
		
		boolean isPalindrome = true;
		
		while(ll.size()>1) {
			if(ll.removeFirst()!=ll.removeLast()) {
				isPalindrome=false;
			}
		}
		
		if (isPalindrome) {
			System.out.println("\"" + input + "\" is a palindrome.");
		} else {
			System.out.println("\"" + input + "\" is NOT a palindrome.");
		}
	}
}
