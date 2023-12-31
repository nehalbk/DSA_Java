/*
 * Question : [Source - Leetcode : https://leetcode.com/problems/valid-parentheses/]
 * 
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	An input string is valid if:
	
	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Every close bracket has a corresponding open bracket of the same type.
	 
	
	Example 1:
	
	Input: s = "()"
	Output: true
	Example 2:
	
	Input: s = "()[]{}"
	Output: true
	Example 3:
	
	Input: s = "(]"
	Output: false
 */

package stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));

	}
	
public static boolean isValid(String s) {
  Stack<Character> stack = new Stack<>();

  for(char c: s.toCharArray()){
      if(c=='(' || c=='['||c=='{') stack.push(c);
      else if(stack.isEmpty()) return false;
      else if(c==')' && stack.pop()!='(') return false;
      else if(c==']' && stack.pop()!='[') return false;
      else if(c=='}' && stack.pop()!='{') return false;

  }
  
  return stack.isEmpty();
}
	
//	public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for(char c: s.toCharArray()){
//            switch(c) {
//            case '(': stack.push(')'); break;
//            case '[': stack.push(']'); break;
//            case '{': stack.push('}'); break;
//            
//            default: if(stack.isEmpty() || stack.pop()!=c) return false;
//            }
//
//        }
//        
//        return stack.isEmpty();
//    }
	


}
