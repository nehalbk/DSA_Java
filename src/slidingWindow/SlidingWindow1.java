package slidingWindow;
/* SLIDING WINDOW ALGORITHM
 * [Source] : https://www.geeksforgeeks.org/window-sliding-technique/
 * 
 * Example: Given an arr of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the arr.
 * Input  : arr[] = {100, 200, 300, 400}, k = 2
 * Output : 700
 *
 * Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
 * Output : 39
 * We get maximum sum by adding subarr {4, 2, 10, 23} of size 4.
 * Input  : arr[] = {2, 3}, k = 3
 * Output : Invalid
 * There is no subarr of size 3 as size of whole arr is 2.
 */

public class SlidingWindow1 {
	
	public static int calculateMaxSum(int[] arr, int n, int k) {
		if(n<k) throw new IllegalArgumentException();
		
		int maxSum=0;
		for(int i=0;i<k;i++) {
			maxSum+=arr[i];
		}
		
		int currSum=maxSum;
		
		for(int i=k;i<n;i++) {
			currSum+=arr[i]-arr[i-k];
			maxSum=Math.max(maxSum, currSum);
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		
		try {
			
			int arr1[] = {100, 200, 300, 400};
			int k1 = 2;
			int n1=4;
			System.out.println(calculateMaxSum(arr1,n1,k1));
			
			int arr2[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
			int k2 = 4; 
			int n2=9;
			System.out.println(calculateMaxSum(arr2,n2,k2));
			
			int arr3[] = {2, 3};
			int k3 = 3; 
			int n3=2;
			System.out.println(calculateMaxSum(arr3,n3,k3));
			
		}catch(IllegalArgumentException E) {
			System.out.println("n < k!\n");
			E.printStackTrace();
		}
		
		
		
	}

}
