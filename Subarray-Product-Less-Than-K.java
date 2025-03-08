class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       
        int j = 0;
        int m = 1;
        int c = 0;
        if ( k <=1)
            return 0;
     for(int i=0;i<nums.length;i++){
        m*=nums[i];
        while(m>=k){
            m/=nums[j];
            j++;
        }
        c+=(i-j+1);
     }
     return c;
    }
}