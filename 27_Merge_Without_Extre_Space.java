// ----------------------Merge Without Extra Space--------------------->
class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int gap = nextGap(n + m);
        
        while (gap > 0) {
            int i = 0, j = gap;