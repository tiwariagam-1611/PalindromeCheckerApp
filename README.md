PalindromeCheckerApp is a console-based Java application that demonstrates thirteen progressive use cases for validating palindromes.

Goal: The overall goal is to strengthen programming fundamentals, explore data structures, recursion, object-oriented design, and performance benchmarking while building a reusable utility for palindrome validation.

UC1: Application Entry & Welcome Message  
Goal: Display a welcome message and app details at startup.  
Description: Introduces the application name and version, sets the execution flow, and demonstrates console output and the role of the main() method.  

UC2: Print a Hardcoded Palindrome Result  
Goal: Display whether a hardcoded string is a palindrome.  
Description: Validates a fixed string using simple conditional logic, reinforcing string handling and console output basics.  

UC3: Palindrome Check Using String Reverse  
Goal: Check whether a string is a palindrome by reversing it.  
Description: Uses a loop to reverse the string and compares it with the original, highlighting string immutability and concatenation.  

UC4: Character Array-Based Palindrome Check  
Goal: Convert a string to a character array and compare characters.  
Description: Applies the two-pointer technique for efficient comparison, demonstrating array indexing and reduced time complexity.  

UC5: Stack-Based Palindrome Checker  
Goal: Use stack to reverse characters and validate palindrome.  
Description: Pushes characters into a stack and pops them for comparison, reinforcing LIFO behavior and reversal logic.  

UC6: Queue + Stack Based Palindrome Check  
Goal: Demonstrate FIFO vs LIFO using Queue and Stack.  
Description: Inserts characters into both structures and compares dequeue vs pop results, highlighting symmetric comparison.  

UC7: Deque-Based Optimized Palindrome Checker  
Goal: Use Deque to compare front and rear elements.  
Description: Removes characters from both ends (removeFirst(), removeLast()) for direct comparison, eliminating the need for reversal.  

UC8: Linked List-Based Palindrome Checker  
Goal: Check palindrome using a linked list.  
Description: Stores characters in a linked list and compares ends, demonstrating double-ended operations and dynamic data handling.  

UC9: Recursive Palindrome Checker  
Goal: Check a palindrome using recursion.  
Description: Compares outer characters moving inward via recursive calls, demonstrating divide-and-conquer logic and base conditions.  

UC10: Normalized Palindrome Validation  
Goal: Ignore spaces and case while checking a palindrome.  
Description: Preprocesses input by removing spaces/symbols and converting to lowercase, ensuring logical validation independent of formatting.  

UC11: Object-Oriented Palindrome Service  
Goal: Encapsulate palindrome logic in a class.  
Description: Implements a PalindromeService class to improve reusability, readability, and separation of concerns, demonstrating encapsulation.  

UC12: Strategy Pattern for Palindrome Algorithms  
Goal: Choose a palindrome algorithm dynamically.  
Description: Defines a PalindromeStrategy interface and injects different implementations at runtime, focusing on algorithm interchangeability.  

UC13: Performance Comparison  
Goal: Compare the performance of different palindrome approaches.  
Description: Benchmarks multiple strategies using System.nanoTime(), captures execution duration, and displays results to introduce performance measurement.  
