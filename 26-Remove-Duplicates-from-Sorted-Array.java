class Solution {
    public int removeDuplicates(int[] nums) {
    //     String s=String.valueOf(nums);
    //   // nums.arraytoCharAt
    //     for(int i=0;i<nums.length;i++){
    //         s.replace(s.contains((s.charAt(i))),' ');
    //     }
    int i;
    int c=1;
    int b[]=new int[nums.length];
    for(i=1;i<nums.length;i++){
        if(nums[i-1]!=nums[i]){
            
            nums[c]=nums[i];
            c++;
        }
    }
    return c;
    }
}