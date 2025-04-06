class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        if (prices == null || prices.length < 2) return 0;
        
        int minPrice = prices[0];
        int maxProfit = 0;