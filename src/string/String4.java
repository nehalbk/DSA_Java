/*
 * Question : [Source - Leetcode : https://https://leetcode.com/problems/valid-palindrome/]
 * 
 * 125. Valid Palindrome

	A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
	
	Given a string s, return true if it is a palindrome, or false otherwise.
	
	 
	
	Example 1:
	
	Input: s = "A man, a plan, a canal: Panama"
	Output: true
	Explanation: "amanaplanacanalpanama" is a palindrome.
	Example 2:
	
	Input: s = "race a car"
	Output: false
	Explanation: "raceacar" is not a palindrome.
	Example 3:
	
	Input: s = " "
	Output: true
	Explanation: s is an empty string "" after removing non-alphanumeric characters.
	Since an empty string reads the same forward and backward, it is a palindrome.
 */

package string;

import java.util.ArrayList;
import java.util.List;

public class String4 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(" "));

	}
    public static boolean isPalindrome(String s) {
    	List<Character> sc= new ArrayList<>();
    	for(int i=0;i<s.length();i++) {
    		if(Character.isLetter(s.charAt(i)) && s.charAt(i)!=' ') {
    			sc.add(s.toLowerCase().charAt(i));
    		}
    	}
    	//sc.stream().forEach(x->System.out.println(x));
    	for(int i=0;i<sc.size()/2;i++) {
    		if(sc.get(i)!= sc.get(sc.size()-1-i)) {
    			return false;
    		}
    	}
 
    	return true;
    }

   
}
