// -------------------------------------------IMPLEMENT ATOI ----------------------------------->
class Solution {
    public int myAtoi(String s) {
        // Your code here
        int i = 0;
        int n = s.length();
        int sign = 1;
        long result = 0;
        
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }