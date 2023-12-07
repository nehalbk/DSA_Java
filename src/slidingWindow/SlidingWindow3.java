/*
 * Question : [Source - Leetcode : https://leetcode.com/problems/contains-duplicate-ii/]
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that 
 	nums[i] == nums[j] and abs(i - j) <= k.

	Example 1:
	
	Input: nums = [1,2,3,1], k = 3
	Output: true
	Example 2:
	
	Input: nums = [1,0,1,1], k = 1
	Output: true
	Example 3:
	
	Input: nums = [1,2,3,1,2,3], k = 2
	Output: false
 */

package slidingWindow;

public class SlidingWindow3 {

	public static void main(String[] args) {
//		int[] nums = {1,2,3,1};
//		int k = 3;
//		int[] nums = {1,0,1,1};
//		int k = 1;
//		int[] nums = {1,2,3,1,2,3};
//		int k = 2;
		int[] nums = {1,2,3,4,5,6,7,8,9,9};
		int k = 3;		

		System.out.println(containsNearbyDuplicate(nums,k));

	}
	
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        k=Math.min(nums.length,k);
        if(nums.length==1){
            return false;
        }       	
        if(k==nums.length && k==2) {
            if(nums[0]==nums[1])
        		return true;
        }
        
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]==nums[j] && (j-i)<=k) {
                    return true;
                }
            }
        }
            
        	return false;
    }
    

}
