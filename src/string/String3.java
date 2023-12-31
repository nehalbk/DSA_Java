/*
 * Question : [Source - Leetcode : https://leetcode.com/problems/length-of-last-word/]
 * 
 * 158. Length of Last Word	
 * 
 * Given a string s consisting of words and spaces, return the length of the last word in the string.

	A word is a maximal substring consisting of non-space characters only.
		
	Example 1:
	
	Input: s = "Hello World"
	Output: 5
	Explanation: The last word is "World" with length 5.
	Example 2:
	
	Input: s = "   fly me   to   the moon  "
	Output: 4
	Explanation: The last word is "moon" with length 4.
	Example 3:
	
	Input: s = "luffy is still joyboy"
	Output: 6
	Explanation: The last word is "joyboy" with length 6.
 */

package string;  

public class String3 {

	public static void main(String[] args) {
		System.out.println(validIPAddress("172.16.254.01"));

	}
    public static String validIPAddress(String queryIP) {
    	String[] parts=queryIP.split("\\.",-1);
    	
    	boolean ipv6=true;
    	
    	if(parts.length==4) return isIPv4(parts);
    	
    	if(parts.length==1) {
    		
    		parts=queryIP.split(":",-1);
    		
    		if(parts.length==8) return isIPv6(parts);
    		
    	}
    	
    	return "Neither";
    }

    
    public static String isIPv4(String[] parts) {
    	
    	for(String i:parts) {
			
			if(!i.matches("\\d+")) {
				
				return "Neither";
			}
			else if(i.startsWith("0") & i.length()>1 ) return "Neither";
			else if(i.length()>4) return "neither";
			else if(Integer.parseInt(i)<0 || Integer.parseInt(i)>255) return "Neither";
		}
    	
    	return "IPv4";
    	
    }
    
    public static String isIPv6(String[] parts) {
    	
		for(String i:parts) {
//			System.out.println(i.matches("[a-fA-F0-9]*"));
			if(i.length()>4 || i.length()<1 || !i.matches("[a-fA-F0-9]*")) {
				return "Neither";
			}
		}
		
		return "IPv6";

    }
}
