// ----------------------------- MAX CIRCUALR SUBARRAY SUM ----------------------->
class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int totalSum = 0;
        int maxSum = kadane(arr);
        int minSum = kadaneMin(arr);
        
        for (int num : arr) {
            totalSum += num;
        }
        if(maxSum < 0) return maxSum;
        
        return Math.max(maxSum, totalSum - minSum);
    }