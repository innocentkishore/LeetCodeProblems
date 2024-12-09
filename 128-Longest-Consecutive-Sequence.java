class Solution {
    public int longestConsecutive(int[] nums) {
        int c=1,max=0;
        Arrays.sort(nums);
        //  for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]);
        //     }
            if(nums.length==0){
                return 0;
            }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                c++;
            }
            else if(nums[i]==nums[i+1]){
                
            }
            else{
                max=Math.max(max,c);
                c=1;
            }
        }
        max=Math.max(max,c);
        return max;
    }
}