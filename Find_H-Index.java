// --------------------------Find H-Index------------------------>
class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        
        for (int i = 0; i < n; i++) {
            int papers = n - i;
            if (citations[i] >= papers) {
                h = papers;
                break;
            }
        }
        return h;
    }
}