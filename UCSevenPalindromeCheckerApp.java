/* Use Case 7: Deque Based Optimized Palindrome Checker

Description:
This class validates a palindrome using a Deque
(Double Ended Queue).

Characters are inserted into the deque and then
compared by removing elements from both ends:

- removeFirst()
- removeLast()

This avoids reversing the string and provides an
efficient front-to-back comparison approach.

This use case demonstrates optimal bidirectional
traversal using Deque.

@author Developer
@version 7.0
*/

package com.palindromeapp;

import java.util.*;

public class UCSevenPalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "civic";
		Deque<Character> que = new ArrayDeque<>();
		for(char ch : input.toCharArray()) {
			que.add(ch);
		}
		boolean isPalindrome = true;
		while(que.size()>1) {
			if(que.removeFirst()!=que.removeLast()) {
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
