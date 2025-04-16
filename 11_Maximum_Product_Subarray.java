// --------------------------Maximum Product Subarray------------------------>
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int maxProduct = arr[0];
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        
        for (int i = 1; i < n; i++) {
            int temp = maxEndingHere; 
            maxEndingHere = Math.max(arr[i], Math.max(arr[i] * maxEndingHere, arr[i] * minEndingHere));
            minEndingHere = Math.min(arr[i], Math.min(arr[i] * temp, arr[i] * minEndingHere));
            
            maxProduct = Math.max(maxProduct, maxEndingHere);
        }
        
        
    }
}