// -----------------------------Overlapping Intervals-------------------------->

class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        List<int[]> result = new ArrayList<>();
        if (arr == null || arr.length == 0) return result;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int[] current = arr[0];
        result.add(current);