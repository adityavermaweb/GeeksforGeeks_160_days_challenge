// ---------------K-th element of two Arrays-------------------->

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length;
        int m = b.length;
        
        if (n > m) {
            return kthElement(b, a, k);
        }
        int low = Math.max(0, k - m);
        int high = Math.min(k, n);
        
        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = k - cut1;