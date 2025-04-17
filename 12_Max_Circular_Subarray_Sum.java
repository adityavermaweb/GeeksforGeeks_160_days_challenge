// ----------------------------- MAX CIRCUALR SUBARRAY SUM ----------------------->
class Solution {

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
    private int kadane(int[] arr) {
        int maxCurrent = arr[0];
        int maxGlobal = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }
        return maxGlobal;
    }
     private int kadaneMin(int[] arr) {
        int minCurrent = arr[0];
        int minGlobal = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            minCurrent = Math.min(arr[i], minCurrent + arr[i]);
            minGlobal = Math.min(minGlobal, minCurrent);
        }
        return minGlobal;
    }
}