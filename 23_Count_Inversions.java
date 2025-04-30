// -----------------------Count Inversions--------------------------->

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }
    static int mergeSortAndCount(int[] arr, int left, int right) {
        int count = 0;
        
        if (left < right) {
            int mid = (left + right) / 2;
            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid + 1, right);
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }