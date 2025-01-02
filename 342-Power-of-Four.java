class Solution {
    public boolean isPowerOfFour(int n) {
          if (n <= 0) return false;
        if (n == 1) return true; // Base case: 3^0 = 1
        return n % 4 == 0 && isPowerOfFour(n / 4); // Recursively divide by 3
        
    }
}