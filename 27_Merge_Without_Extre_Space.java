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

            while (j < n + m) {
               int val1 = getValue(a, b, i, n);
               int val2 = getValue(a, b, j, n);
                
               if (val1 > val2) {
                   setValue(a, b, i, val2, n);
                   setValue(a, b, j, val1, n);
                    
               }
               i++;
               j++;
            }
            gap = nextGap(gap);
        }
    }
    private int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }
    private int getValue(int[] a, int[] b, int idx, int n) {
        return idx < n ? a[idx] : b[idx - n];
    }
    private void setValue(int[] a, int[] b, int idx, int value, int n) {
        if (idx < n) a[idx] = value;
        else b[idx - n] = value;
    }
}