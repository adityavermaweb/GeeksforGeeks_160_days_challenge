// ------------------------MIN CHARS TO ADD FOR PALINDROM -------------------------------->
class Solution {
    public static int minChar(String s) {
        // Write your code here
        StringBuilder rev = new StringBuilder(s).reverse();
        String combined = s + "$" + rev;
        
        int[] lps = computeLPS(combined);
        
        return s.length() - lps[combined.length() - 1];
    }
    private static int[] computeLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0;
        
        int i = 1;
        while (i < n) {