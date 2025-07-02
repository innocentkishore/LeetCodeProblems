class Solution {
    
    public int jump(int[] nums) {
    int left=0;
    int right=0;
    int jump=0;
    int fare=0;
    while(right<nums.length-1){
       fare=0;
        for(int i=left;i<=right;i++){
        fare= Math.max(fare,nums[i]+i);
        }
         left=right+1;
        right=fare;
       
        jump++;
    }
    return  jump;
    }
}