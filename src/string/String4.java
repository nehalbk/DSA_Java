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

public class String4 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

	}
    
//	public static boolean isPalindrome(String s) {
//    	int left=0,right=s.length()-1;
//    	s=s.toLowerCase();
//    	while(left<right) {
//    		if(!Character.isLetterOrDigit(s.charAt(left))) {
//        			left++;
//        		}else if(!Character.isLetterOrDigit(s.charAt(right))) {
//        			right--;
//    		}else if(s.charAt(right)!=s.charAt(left)) {
//    			return false;
//    		}else {
//    			left++;
//    			right--;
//    		}
//    		System.out.println(s.charAt(left)+" "+ s.charAt(right));
//    		
//
//    	}
// 
//    	return true;
//    }
	
	public static boolean isPalindrome(String s) {
    	int left=0,right=s.length()-1;
    	s=s.toLowerCase();
    	while(left<right) {
    		if(!Character.isLetterOrDigit(s.charAt(left))) {
        			left++;
        			continue;
    		}
        	if(!Character.isLetterOrDigit(s.charAt(right))) {
        			right--;
        			continue;
        	}
    		if(s.charAt(right)!=s.charAt(left)) {
    			return false;
    		}
    		left++;
    		right--;
    		
    	}
 
    	return true;
    }

   
}
