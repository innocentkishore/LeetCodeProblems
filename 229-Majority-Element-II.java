class Solution {
    public List<Integer> majorityElement(int[] nums) {
     int val1=0;
     List<Integer> li=new ArrayList<>();
     int val2=0;
     int count1=0;
     int count2=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==val1)
        count1++;
        else if(nums[i]==val2)
        count2++;
        else{
            if(count1==0){
                val1=nums[i];
                count1=0;
            }
            else if(count2==0){
                val2==nums[i];
                count1=0;
            }
            else{

            }
        }
     }
    }
}