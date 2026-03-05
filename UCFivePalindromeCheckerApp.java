package com.palindromeapp;

import java.util.Stack;

/*
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data inputucture which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */


public class UCFivePalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "Radae";
		Stack<Character> stk = new Stack<>();
		for(char ch : input.toCharArray()) {
			stk.push(ch);
		}
		boolean isPalindrome = true;
		for(char ch:input.toCharArray()) {
			if(stk.peek()!=ch) {
				isPalindrome=false;
			}
			stk.pop();
		}
		if (isPalindrome) {
			System.out.println("\"" + input + "\" is a palindrome.");
		} else {
			System.out.println("\"" + input + "\" is NOT a palindrome.");
		}
	}
}
