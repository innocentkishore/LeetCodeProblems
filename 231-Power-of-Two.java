class Solution {
    public boolean isPowerOfTwo(int n) {
          if (n <= 0) return false;
        if (n == 1) return true; // Base case: 3^0 = 1
        return n % 2 == 0 && isPowerOfTwo(n / 2); // Recursively divide by 3
    }
}