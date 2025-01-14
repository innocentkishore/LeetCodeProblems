class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        //  System.out.print(Arrays.toString(nums));
        for(int i=1;i<nums.length;i+=3){
            if(nums[i]!=nums[i-1]) return nums[i-1];
        }
       
     return nums[nums.length-1];
    }
}