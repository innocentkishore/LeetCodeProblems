class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int k=0;
        int []res=new int[nums.length+1];
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        System.out.print("index"+idx);
        if(idx==-1){
            for(int i=nums.length-1;i>=0;i--){
                res[k++]=nums[i];
            }
              for(int i=0;i<nums.length;i++){
           nums[i]=res[i];
        }
        }
        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[idx]){
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                    break;
                }
            }
            int []rh=new int [nums.length-idx-1];
            int m=0;
            for(int i=idx+1;i<nums.length;i++){
                rh[m++]=nums[i];

            }
            Arrays.sort(rh);
            m=0;
            for(int i=0;i<rh.length;i++){
                System.out.println("half"+rh[i]);
            }
            for(int i=idx+1;i<nums.length;i++){
                nums[i]=rh[m++];
            }
        }
        for(int i=0;i<nums.length;i++){
            // System.out.print(nums[i]);
        }
    }
}