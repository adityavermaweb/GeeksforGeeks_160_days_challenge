// --------------------------Peak Element------------------->
class Solution {

    public int peakElement(int[] arr) {
        // code here
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean left = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean right = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);
            
            if (left && right) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
