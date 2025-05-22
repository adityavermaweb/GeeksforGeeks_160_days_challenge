// ------------------Kth Missing Positive Number in a Sorted Array------------------->
class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n = arr.length;
        int missingCount = 0;
        int current = 1;
        int i = 0;