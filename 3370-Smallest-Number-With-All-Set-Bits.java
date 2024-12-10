class Solution {
    public int smallestNumber(int n) {
        int a=Integer.toBinaryString(n).length();
        return (int)(Math.pow(2,a))-1;
    }
}