/* Use Case 13: Performance Comparison

Description:

This class measures and compares the execution
performance of palindrome validation algorithms.

At this stage, the application:
- Uses a palindrome strategy implementation
- Captures execution start and end time
- Calculates total execution duration
- Displays benchmarking results

This use case focuses purely on performance
measurement and algorithm comparison.

The goal is to introduce benchmarking concepts.

@Author Developer
@Version 13.0
*/
package com.palindromeapp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

interface PalindromeStrategy{
	boolean check(String input);
}
public class UCThirteenPalindromeApp {
	public static void main(String[] args) {
		String input = "radar";
		long startStack = System.nanoTime();
		StackStrategy stack = new StackStrategy();
		boolean stackResult = stack.check(input);
		long endStack = System.nanoTime();
		long stackTime = endStack-startStack;
		System.out.println("Result using Stack "+stackResult+" Time Taken "+stackTime+"ns");
		
		long startArray = System.nanoTime();
		CharArrayStrategy array = new CharArrayStrategy();
		boolean arrayResult = array.check(input);
		long endArray = System.nanoTime();
		long arrayTime = endArray-startArray;
		System.out.println("Result using Char Array "+arrayResult+" Time Taken "+arrayTime+"ns");
		
		long startLinkL = System.nanoTime();
		StackStrategy linkL = new StackStrategy();
		boolean linkLResult = linkL.check(input);
		long endLinkL = System.nanoTime();
		long linkLTime = endLinkL-startLinkL;
		System.out.println("Result using LinkedList "+linkLResult+" Time Taken "+linkLTime+"ns");
		
		long startStackQueue = System.nanoTime();
		StackStrategy stackQueue = new StackStrategy();
		boolean stackQueueResult = stackQueue.check(input);
		long endStackQueue = System.nanoTime();
		long stackQueueTime = endStackQueue-startStackQueue;
		System.out.println("Result using Stack and Queue "+stackQueueResult+" Time Taken "+stackQueueTime+"ns");
		
		long startDequeue = System.nanoTime();
		StackStrategy dequeue = new StackStrategy();
		boolean dequeueResult = dequeue.check(input);
		long endDequeue = System.nanoTime();
		long dequeueTime = endDequeue-startDequeue;
		System.out.println("Result using Dequeue "+dequeueResult+" Time Taken "+dequeueTime+"ns");
		
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

class LinkedListStrategy implements PalindromeStrategy{
	public boolean check(String input) {
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
		return isPalindrome;
	}
}

class CharArrayStrategy implements PalindromeStrategy{
	public boolean check(String input) {
		char[] chars = input.toCharArray();

		int start = 0;
		int end = chars.length - 1;

		boolean isPalindrome = true;

		while (start < end) {
			if (chars[start] != chars[end]) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		return isPalindrome;

	}
}


class StackQueue implements PalindromeStrategy{
	public boolean check(String input) {
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
		return isPalindrome;
	}
}

class DequeueStrategy implements PalindromeStrategy{
	public boolean check(String input) {
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
		return isPalindrome;
	}
}


