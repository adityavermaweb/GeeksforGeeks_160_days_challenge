// ---------------------------------SEARCH PATTERN (KMP ALGORITHM)--------------------------->
 private int[] computeLPS(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;