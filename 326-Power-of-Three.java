class Solution {
    public boolean find(int a,int n){
      
       if(a==n){
        return true;
       }
       if(a>n) return false;
       return find(a*3,n);
    }
    public boolean isPowerOfThree(int n) {
  if (n <= 0) return false;
        if (n == 1) return true; // Base case: 3^0 = 1
        return n % 3 == 0 && isPowerOfThree(n / 3); // Recursively divide by 3
    }
}