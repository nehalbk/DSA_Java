/*
 * Question: [Source - Leetcode : https://https://leetcode.com/problems/longest-nice-substring/]
 * 
 * -----------------------------------------------------------------------------------------------------------------
 * Logest Nice Substring
 * -----------------------------------------------------------------------------------------------------------------
 * 
 * A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. 
 * For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b'
 *  appears, but 'B' does not.

	Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the
	 earliest occurrence. If there are none, return an empty string.
	
	 
	
	Example 1:
	
	Input: s = "YazaAay"
	Output: "aAa"
	Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
	"aAa" is the longest nice substring.
	Example 2:
	
	Input: s = "Bb"
	Output: "Bb"
	Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.
	Example 3:
	
	Input: s = "c"
	Output: ""
	Explanation: There are no nice substrings.
 */
package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow5 {

	public static void main(String[] args) {
		String s = "YazaAay";
		
		System.out.println(longestNiceSubstring(s));
	}
	
    public static String longestNiceSubstring(String s) {
    	String ans="";
    	List<String> bag=new ArrayList<>();
        for(int i=0;i<s.length();i++) {
        	String word=String.valueOf(s.charAt(i));
        	for(int j=i+1;j<s.length();j++) {
        		word= word+s.charAt(j);
        		bag.add(word);
        	}
        }
        boolean flag=false;
        for(String i:bag) {
        	flag=true;
        	for(int c=0;c<i.length();c++) {
        		if(Character.isUpperCase(i.charAt(c))) {
        			if(!i.contains(String.valueOf(Character.toLowerCase(i.charAt(c))))) {
        				flag=false;
        			}
        		}else {
        			if(!i.contains(String.valueOf(Character.toUpperCase(i.charAt(c))))) {
            				flag=false;
            			}
        			}
        		}
        	if(flag && i.length()>ans.length()) {
        		ans=i;
        		}
        	}
       
        return ans;
    }

}
