class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int c=0;
        for(int i=0;i<31;i++){
if ((ans & (1 << i)) != 0) {
    c++;
}

        }
        return c;
    }
}