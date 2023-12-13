/*
 * Question : [Source - Leetcode : https://https://leetcode.com/problems/defanging-an-ip-address/]
 * 
 * 1108. Defanging an IP Address
 * 
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.

	A defanged IP address replaces every period "." with "[.]".
	
	 
	
	Example 1:
	
	Input: address = "1.1.1.1"
	Output: "1[.]1[.]1[.]1"
	Example 2:
	
	Input: address = "255.100.50.0"
	Output: "255[.]100[.]50[.]0"
 */

package string;

public class String1 {

	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));

	}
    public static String defangIPaddr(String address) {
    	
        return address.replace(".", "[.]");
    }


}
