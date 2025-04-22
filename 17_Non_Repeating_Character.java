// -----------------------------NON REPEATING CHARACTER ----------------------------------------->
class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        int [] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }