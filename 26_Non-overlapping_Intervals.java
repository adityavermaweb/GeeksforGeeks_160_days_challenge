// ---------------------Non-overlapping Intervals----------------------->
class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        if (intervals.length == 0) return 0;
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));