/* Description:
This class demonstrates palindrome validation using
two different data structures:

- Queue (FIFO - First In First Out)
- Stack (LIFO - Last In First Out)

Characters are inserted into both structures and then
compared by removing from the front of the queue and
the top of the stack.

If all characters match, the input string is confirmed
as a palindrome.

This use case helps understand how FIFO and LIFO
behaviors can be combined for symmetric comparison.

* @author Developer
* @version 6.0
*/

package com.palindromeapp;

import java.util.*;

public class UCSixPalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "civic";
		Stack<Character> stk = new Stack<>();
		Queue<Character> que = new LinkedList<>();
		for(char ch : input.toCharArray()) {
			stk.push(ch);
			que.add(ch);
		}
		boolean isPalindrome = true;
		while(!que.isEmpty()) {
			if(que.poll()!=stk.pop()) {
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
