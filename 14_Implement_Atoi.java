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
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Interger.MAX_VALUE;
            }
            if(sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            
            i++;
        }
        
        return (int) (sign * result);
    }
}