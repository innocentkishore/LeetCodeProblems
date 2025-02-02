class Solution {
    public boolean check(int[] nums) {
     int a[]=new int[2*nums.length];
       int k=0;
       int j=nums.length;
       int index=0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]>nums[i+1]){
            index=i+1;
            break;
        }
    }

    for( int i=0;i<nums.length;i++){
        a[k++]=nums[i];
        a[j++]=nums[i];
       // min=Math.min(min,nums[i]);
    //    if(nums[i]<=min){
    //     min=nums[i];
    //     index=i;
       }
    
//System.out.println(index);
    for(int i=index;i<nums.length+index-1;i++){
       System.out.print(a[i]);
        if(a[i]>a[i+1]) return false;

    }
    
    //System.out.println(a[5]);
    
    return true;
    }
}