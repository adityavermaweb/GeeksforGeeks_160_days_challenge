// ----------------------Search in Rotated Sorted Array------------------>
class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int n = arr.length;
        int low = 0, high = n - 1;