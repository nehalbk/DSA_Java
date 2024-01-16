/*
 * Question : [Source - Leetcode : https://leetcode.com/problems/pascals-triangle-ii/description/]
 * 
 * 119. Pascal's Triangle II
 * 
	Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
	
	In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
	
	
	 
	
	Example 1:
	
	Input: rowIndex = 3
	Output: [1,3,3,1]
	Example 2:
	
	Input: rowIndex = 0
	Output: [1]
	Example 3:
	
	Input: rowIndex = 1
	Output: [1,1]
	 
	
	Constraints:
	
	0 <= rowIndex <= 33
	 
	
	Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
*/
		
	package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays5 {

	public static void main(String[] args) {
		int  numRows = 7;
		System.out.println(generate(numRows));
	}

	public static List<Integer> generate(int numRows){
		List<List<Integer>> res=new ArrayList<>();
		
		
		res.add(Arrays.asList(1));
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=new ArrayList<>(i+1);
            temp.add(1);
            temp.add(1);;
            for(int j=1;j<i;j++){
                temp.add(1,res.get(i-1).get(j)+res.get(i-1).get(j-1));
            }
            res.add(temp);
        }
        return res.get(numRows);
    }
    
}
