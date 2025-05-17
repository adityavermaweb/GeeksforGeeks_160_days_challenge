// --------------------------Peak Element------------------->
class Solution {

    public int peakElement(int[] arr) {
        // code here
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;