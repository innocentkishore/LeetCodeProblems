class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1) return 1;
        int w=findTheWinner(n-1,k);
        return (w+(k-1))%n+1;
    }
}