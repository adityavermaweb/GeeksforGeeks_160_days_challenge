// ----------------------Number of Occurrence--------------->
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int first = findFirst(arr, target);
        if (first == -1) return 0;
        int last = findLast(arr, target);
        return last - first + 1;
    }