// --------------------------MINIMIZE THE HEIGHTS II ------------------------------->
class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;
        
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;