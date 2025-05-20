// -----------------Aggressive Cows---------------->
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;