class Solution {
    public String longestPalindrome(String s) {
           int n = s.length();
        if (n <= 1) return s;

        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {
            // Odd-length palindrome (single character center)
            int l = i, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    start = l;
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }

            // Even-length palindrome (two character center)
            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    start = l;
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }
        }

        return s.substring(start, start + maxLen);
        
    }
}