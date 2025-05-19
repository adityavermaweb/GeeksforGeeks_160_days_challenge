// ---------------K-th element of two Arrays-------------------->

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length;
        int m = b.length;
        
        if (n > m) {
            return kthElement(b, a, k);
        }