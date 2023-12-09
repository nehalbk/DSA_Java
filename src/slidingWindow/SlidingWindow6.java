/*
 * Question: [Source - Leetcode : https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/]
 * 
 * -----------------------------------------------------------------------------------------------------------------
 * 1984 Minimum difference between hghest and lowest of K scores
 * -----------------------------------------------------------------------------------------------------------------
 * 
 * You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. 
 * You are also given an integer k.

	Pick the scores of any k students from the array so that the difference between the highest and the
	 lowest of the k scores is minimized.
	
	Return the minimum possible difference.
	
	 
	
	Example 1:
	
	Input: nums = [90], k = 1
	Output: 0
	Explanation: There is one way to pick score(s) of one student:
	- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
	The minimum possible difference is 0.
	Example 2:
	
	Input: nums = [9,4,1,7], k = 2
	Output: 2
	Explanation: There are six ways to pick score(s) of two students:
	- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
	- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
	- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
	- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
	- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
	- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
	The minimum possible difference is 2.
 */
package slidingWindow;

import java.util.Arrays;

public class SlidingWindow6 {

	public static void main(String[] args) {
//		int[] nums = {1,2,3,1};
//		int k = 3;
//		int[] nums = {1,0,1,1};
//		int k = 1;
//		int[] nums = {90};
//		int k = 1;
		int[] nums = {9,4,1,7};
		int k = 2;	
		System.out.println(minimumDifference(nums,k));
	}
	
    public static int minimumDifference(int[] nums, int k){
    	//edge case
    	if(nums.length==1) return 0;
    	
    	//we need minimum difference
    	//we can get minimum difference when we sort array and take adjacent elements
        Arrays.sort(nums);
        
        //the window size is k hence calculating initial difference
        int diff=nums[k-1]-nums[0];
        
        //sliding window, calculating min difference and storing it in diff
        for(int i=k;i<nums.length;i++){
            diff=Math.min(diff,nums[i]-nums[i-k+1]);
        }
        
        //returning diff
        return diff;
    }

}
