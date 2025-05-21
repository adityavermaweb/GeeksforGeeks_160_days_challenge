// ------------------Allocate Minimum Pages-------------->
class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if (arr.length < k) return -1;
        
        int low = 0, high = 0;
        for(int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isFeasible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }