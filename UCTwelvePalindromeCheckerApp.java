/* Use Case 12: Strategy Pattern for Palindrome Algorithms

Description:
This class demonstrates how different palindrome
validation algorithms can be selected dynamically
at runtime using the Strategy Design Pattern.

At this stage, the application:
- Defines a common PalindromeStrategy interface
- Implements a concrete Stack based strategy
- Injects the strategy at runtime
- Executes the selected algorithm

No performance comparison is done in this use case.
The focus is purely on algorithm interchangeability.

The goal is to teach extensible algorithm design.

@author Developer
@version 12.0
*/
package com.palindromeapp;

import java.util.Stack;

interface PalindromeStrategy{
	boolean check(String input);
}
public class UCTwelvePalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "radar";
		StackStrategy stkstrat = new StackStrategy();
		if(stkstrat.check(input)) {
			System.out.println("\"" + input + "\" is a palindrome.");
		} else {
			System.out.println("\"" + input + "\" is NOT a palindrome.");
		}
		
	}
}

class StackStrategy implements PalindromeStrategy{
		public boolean check(String input) {
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
		return isPalindrome;

	}
}



