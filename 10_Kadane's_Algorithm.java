// --------------------------Kadane's Algorithm----------------------->
class Solution {
    int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }
}
