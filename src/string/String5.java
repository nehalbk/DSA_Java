/*
 * Question : [Source - Leetcode : https://leetcode.com/problems/plus-one/]
 * 
 * 66. Plus One
	
	You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
	
	Increment the large integer by one and return the resulting array of digits.
	
	 
	
	Example 1:
	
	Input: digits = [1,2,3]
	Output: [1,2,4]
	Explanation: The array represents the integer 123.
	Incrementing by one gives 123 + 1 = 124.
	Thus, the result should be [1,2,4].
	Example 2:
	
	Input: digits = [4,3,2,1]
	Output: [4,3,2,2]
	Explanation: The array represents the integer 4321.
	Incrementing by one gives 4321 + 1 = 4322.
	Thus, the result should be [4,3,2,2].
	Example 3:
	
	Input: digits = [9]
	Output: [1,0]
	Explanation: The array represents the integer 9.
	Incrementing by one gives 9 + 1 = 10.
	Thus, the result should be [1,0].
	 
	
	Constraints:
	
	1 <= digits.length <= 100
	0 <= digits[i] <= 9
	digits does not contain any leading 0's.
 */
	
package string;

public class String5 {

	public static void main(String[] args) {
		int[] digits = {9,9,9};
		System.out.println(plusOne(digits));

	}
	
	public static int[] plusOne(int[] digits) {
		boolean carry=false;
        int prev=1;
        for(int i=digits.length-1;i>=0;i--){
            if((prev+digits[i])>9) carry =true;
            else carry= false;
            prev=(digits[i]+prev)/10;
        }
        if(carry){
            int[] res=new int[digits.length+1];
            prev=1;
            for(int i=res.length-1;i>0;i--){
                res[i]=(digits[i-1]+prev)%10;
                prev=(digits[i-1]+prev)/10;
            }
            res[0]=1;
            for(int i:res) {
            	System.out.println(i);
            }
            return res;
        }else{
        	int[] res=new int[digits.length];
            prev=1;
            for(int i=res.length-1;i>=0;i--){
                res[i]=(digits[i]+prev)%10;
                prev=(digits[i]+prev)/10;
            }
            for(int i:res) {
            	System.out.println(i);
            }
            return res;
        }


        
        
    }

   
}
