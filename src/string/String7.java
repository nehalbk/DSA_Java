/*
 * Question : [Source - Leetcode : https://leetcode.com/problems/reverse-string/]
 * 
 * 344. Reverse String

	Write a function that reverses a string. The input string is given as an array of characters s.
	
	You must do this by modifying the input array in-place with O(1) extra memory.
	
	 
	
	Example 1:
	
	Input: s = ["h","e","l","l","o"]
	Output: ["o","l","l","e","h"]
	Example 2:
	
	Input: s = ["H","a","n","n","a","h"]
	Output: ["h","a","n","n","a","H"]
	 
	
	Constraints:
	
	1 <= s.length <= 105
	s[i] is a printable ascii character.
 */
	
package string;

public class String7 {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		for(char i:reverseString(s)) {

			System.out.print(i);
		}

	}
	
	public static char[] reverseString(char[] s) {
		for(int i=0,j=s.length-1;i<j;i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
		return s;
    }

   
}
