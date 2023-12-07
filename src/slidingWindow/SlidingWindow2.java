package slidingWindow;
/*
 * Question : [Source - Leetcode : https://leetcode.com/problems/maximum-average-subarray-i/]
 * You are given an integer array nums consisting of n elements, and an integer k.

	Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
	Any answer with a calculation error less than 10-5 will be accepted.
	
	 
	
	Example 1:
	
	Input: nums = [1,12,-5,-6,50,3], k = 4
	Output: 12.75000
	Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
	Example 2:
	
	Input: nums = [5], k = 1
	Output: 5.00000
 */

public class SlidingWindow2 {

	public static void main(String[] args) {
//		int[] nums = {1,12,-5,-6,50,3};
//		int k = 4;
		int[] nums = {5};
		int k = 1;
		System.out.println(findMaxAverage(nums,k));
	}
	
    public static double findMaxAverage(int[] nums, int k) {
    	
    	double max=0;
    	//calculate initial sum of k elements
    	for(int i=0;i<k;i++) {
    		max+=nums[i];
    	}
    	
    	//now to calculate sum of next k elements
    	//we can add k+1 element and remove first element
    	//repeat till the end
    	double temp=max;
    	for(int i=k;i<nums.length;i++) {
    		temp+=nums[i]-nums[i-k];
    		max=Math.max(max, temp);
    	}
    	
    	//need to return average hence dividing by k
        return max/k;
    }

}
