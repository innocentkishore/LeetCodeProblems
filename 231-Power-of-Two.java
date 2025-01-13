class Solution {
    public boolean isPowerOfTwo(int n) {
          if (n <= 0) return false;
        if (n == 1) return true; // Base case: 3^0 = 1
        return (n > 0 && (n & (n - 1)) == 0);

    }
}